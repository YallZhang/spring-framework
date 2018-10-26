package org.springframework.train.context.insight.s5annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao22;

    @Resource
    private UserDao userDao13;

    @Autowired
    @Qualifier(value = "userDao")
    private UserDao userDao;


    public UserServiceImpl() {
        System.out.println("UserServiceImpl Constructor...");
        System.out.println("*********" + userDao22);
        System.out.println("*********" + userDao13);
        System.out.println("*********" + userDao);
    }

    @Override
    public void save() {
        userDao13.save();
    }

    /*
      @Resource可以同时指定 既可以指定name也可以指定type，默认byName。
      @Autowired是根据类型进行自动装配的（所以springIOC容器中只能有一个bean;）,
      如果SpringIOC中有多个bean，则可以配合@Qualifier(value="name")指定。
     */

    public UserDao getUserDao22() {
        return userDao22;
    }

    public void setUserDao22(UserDao userDao22) {
        this.userDao22 = userDao22;
    }

    public UserDao getUserDao13() {
        return userDao13;
    }

    public void setUserDao13(UserDao userDao13) {
        this.userDao13 = userDao13;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
