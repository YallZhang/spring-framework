package org.springframework.train.context.insight.s1hellospring;

import org.springframework.train.context.insight.model.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryOnly {
    public void testIOC() {
        Resource resource = new ClassPathResource("spring-config.xml");
        //DefaultListableBeanFactory实现了BeanDefinitionRegistry接口，内有属性Map<String, BeanDefinition> beanDefinitionMap
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        System.out.println("--------XmlBeanDefinitionReader创建开始----------");
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        System.out.println("--------XmlBeanDefinitionReader创建完毕----------");

        System.out.println("--------开始注册BeanDefinitions---------");
        reader.loadBeanDefinitions(resource);
        System.out.println("--------BeanDefinitions注册完毕--------");

        System.out.println();

        //此种方式获取bean和Context无关，只是利用BeanFactory的功能创建bean.

        System.out.println("---------getBean开始----------");
        User user = factory.getBean("user", User.class);
        System.out.println("---------getBean结束----------");

        System.out.println("打印user:" + user);
    }

    public static void main(String[] args) {
        BeanFactoryOnly justBeanFactory = new BeanFactoryOnly();
        justBeanFactory.testIOC();











    }
}
