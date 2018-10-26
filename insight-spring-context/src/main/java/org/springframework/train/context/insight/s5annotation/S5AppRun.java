package org.springframework.train.context.insight.s5annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解方式
 */
public class S5AppRun {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring/5_spring-bean.xml");
        UserController userController = classPathXmlApplicationContext.getBean(UserController.class);
        userController.execute();


    }
}
