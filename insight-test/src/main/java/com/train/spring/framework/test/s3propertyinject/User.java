package com.train.spring.framework.test.s3propertyinject;

import org.springframework.stereotype.Component;

//@Component
public class User {
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public User() {
        super();
        System.out.println("--------User对象创建[无参的构造函数]------");
    }

    public User(int id, String name) {
        System.out.println("----User对象的创建---[有参构造函数]");
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void init_user() {
        System.out.println("创建对象之后，初始化");
    }

    public void destroy_user() {
        System.out.println("IOC容器销毁，user对象回收！");
    }
}
