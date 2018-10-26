package org.springframework.train.context.insight.s3propertyinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zyn on 2017/6/21.
 */
public class TestIOC {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("spring/3_spring-bean.xml");

    public void testSetProperty() {
//        User user = (User) ac.getBean("user");
//        System.out.println(user);
    }

    public void testExecuteAction() {
//        UserAction userAction = ac.getBean("userAction", UserAction.class);
//        userAction.execute();
    }

    public void testAc() {
        String[] acs = ac.getBeanDefinitionNames();
        System.out.println("所有application中bean的数量" + acs.length);
        for (String name : acs) {
            System.out.println(name);
        }
    }
}
