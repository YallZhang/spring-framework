package com.train.spring.framework.test.s5annotation;

import org.springframework.stereotype.Component;
//注解本身不起任何作用，它只是记录一些元数据信息，这些信息自然要有其它处理器去解析。
//spring体系中的@Component注解就由<context:component-scan>标签所代表的处理器ContextNamespaceHandler去处理。
//<context:component-scan base-package>配置项不但启用了对类包进行扫描以实施注解驱动定义Bean功能，
//同时还启用了注解驱动自动注入的功能（即还隐式地在内部注册了org.springframework.context.annotation.internalAutowireAnnotationBeanProcessor和
// internalCommonAnnotationBeanPostProcessor）,这两个类时负责解析@AutoWried、@Resource注解的。

//@Component("userDao") 等同于
@Component
public class UserDao {
    public UserDao() {
        System.out.println("UserDao Constrcte...");
    }

    public void save() {
        System.out.println("DB:保存用户");
    }

    @Override
    public String toString() {
        return "UserDao{}";
    }
}
