package com.train.spring.framework.test.s2objectcreate;

import com.train.spring.framework.test.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zyn on 2017/6/21.
 */
public class IOCTest1 {
    public void testIOC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/2_spring-bean.xml");

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("---------------" + applicationContext.getBean(name) + "-------------");
        }
        System.out.println("多例模式的bean: " + applicationContext.getBean("user2"));
    }

    public static void main(String[] args) {
        IOCTest1 ioc = new IOCTest1();
        ioc.testIOC();




    }
}
