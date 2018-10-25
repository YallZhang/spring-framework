package com.train.spring.framework.test.s6springIocApi;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public void save() {
        userDao.save();
    }
}
