package com.train.spring.framework.test.s6springIocApi;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void save() {
        System.out.println("DB:保存用户");
    }
}
