package org.springframework.train.context.insight.s2objectcreate;

import org.springframework.train.context.insight.model.User;

public class ObjectFactory {
    public User getInstance() {
        return new User(100, "工厂：调用实例方法");
    }

    public static User getStaticInstance() {
        return new User(101, "工厂：调用静态方法");
    }
}
