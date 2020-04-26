package org.springframework.train.aop.insight.explore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zyn on 2017/7/1.
 */
public class AppRun {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/1_spring-aop-config.xml");
        //1. 此时spring-aop框架会自动为IOC容器中的bean，也就是目标对象userMapperImpl创建动态代理对象
        //2. 而且该代理对象中的回调方法采用的是IOC容器中bean:AopHandler切面类中的切面方法
        //3. 因为userMapperImpl有实现的接口，故此时spring-aop采用的是jdk动态代理
        System.out.println("----------bean加载完毕-------");
        System.out.println();
        System.out.println();
        System.out.println();

        try {
            UserMapper userMapperProxy_1 = (UserMapperImpl) applicationContext.getBean(UserMapper.class);
            UserMapper userMapperProxy_2 = (UserMapperImpl) applicationContext.getBean(UserMapperImpl.class);
            UserMapper userMapperProxy_3 = (UserMapperImpl) applicationContext.getBean("userMapperImpl");
            System.out.println("userMapperProxy_1 类型:" + userMapperProxy_1.getClass().getSimpleName() + "obj:" + userMapperProxy_1);
            int res = userMapperProxy_1.insertUser("shiminL");
            System.out.println();
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            //todo:注意：当 <aop:config proxy-target-class="false">时使用的JDK接口代理，会生成一个UserMapper接口的新类，
            //所以使用(UserMapperImpl)强转时肯定会报错，因为类型对不上。
            //如果是使用<aop:config proxy-target-class="true">，则使用的是CGLib基于子类的代理，会创建UserMapperImpl的子类，
            //所以使用(UserMapperImpl)强转时肯定不会报错。
            //正常的，我们应该基于接口来使用：比如：
            UserMapper userMapperProxy_Right = (UserMapper) applicationContext.getBean(UserMapper.class);

        }


        //目标对象没有实现接口时，spring aop会使用cglib代理
        SupplierMapperImpl supplierMapperImp_Proxy = (SupplierMapperImpl) applicationContext.getBean("supplierMapperImpl");
        System.out.println("supplierMapperImp_Proxy 类型:" + supplierMapperImp_Proxy.getClass().getSimpleName() + "obj:" + supplierMapperImp_Proxy);
        supplierMapperImp_Proxy.insertSupplier("李云龙");
        System.out.println();
        System.out.println();
        System.out.println();


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("---------------------------------打印所有bean--------------------");
        for (String name : beanDefinitionNames) {
            Object obj = applicationContext.getBean(name);
            System.out.println("---name: " + name + "---类型：" + obj.getClass().getSimpleName() + "   值：" + obj + "-------------");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        ((ClassPathXmlApplicationContext) applicationContext).destroy();
        System.out.println("main方法结束");
    }
}
