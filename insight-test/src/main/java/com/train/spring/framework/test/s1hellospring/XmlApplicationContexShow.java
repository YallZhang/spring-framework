package com.train.spring.framework.test.s1hellospring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplicationContexShow {
    public void testIOC() {
        //此种方式在通过ApplicationContext获取bean之前就已经把所有的bean注册到上下文中了。applicationContext.getBean(..)内部也只是调用内部的BeanFactory获取bean实例
        System.out.println("----容器创建开始----");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("----容器创建结束----");

//        User user1 = (User) ac.getBean("user");
//        System.out.println("从容器中获取user1对象" + user1);
//        User user2 = (User) ac.getBean("user");
//        System.out.println("从容器中获取user2对象" + user2);

        ac.destroy();

    }

    public static void main(String[] args) {
        XmlApplicationContexShow getIOC2 = new XmlApplicationContexShow();
        getIOC2.testIOC();















    }
}
