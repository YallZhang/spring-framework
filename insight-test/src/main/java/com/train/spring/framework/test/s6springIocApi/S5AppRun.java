package com.train.spring.framework.test.s6springIocApi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解方式
 */
public class S5AppRun {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/6_spring-bean.xml");
        UserAction userAction = (UserAction) ac.getBean("userAction");
        userAction.execute();

        //spring IOC容器ApplicationContext的相关API:
        //如获取App的名字、获取一共注入了多少个bean等
        String appName = ac.getApplicationName();//null
        System.out.println("********" + appName);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
