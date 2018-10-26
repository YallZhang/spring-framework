package org.springframework.train.context.insight.s4autoassembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配 byName  byType
 */
public class S4AppRun {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/4_spring-bean.xml");
        //UserAction userAction = (UserAction) ac.getBean("userAction");
        //userAction.execute();


        UserDao userDao = (UserDao) ac.getBean("userDao");
        System.out.println(userDao);
        System.out.println(userDao.getMap().size());









    }
}
