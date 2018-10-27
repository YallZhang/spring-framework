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
        UserMapper userMapperProxy = (UserMapper) applicationContext.getBean("userMapperImpl");
        int res = userMapperProxy.insertUser("shiminL");

/*        //目标对象没有实现接口时，spring aop会使用cglib代理
        SupplierMapperImpl supplierMapperImp_Proxy = (SupplierMapperImpl) ac.getBean("supplierMapperImpl");
        supplierMapperImp_Proxy.insertSupplier("李云龙");*/

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("---------------------------------打印所有bean--------------------");
        for (String name : beanDefinitionNames) {
//            Object obj = applicationContext.getBean(name);
//            System.out.println("---name: "+name+"---类型：" + obj.getClass().getSimpleName() + "   值：" + obj + "-------------");
        }
    }
}
