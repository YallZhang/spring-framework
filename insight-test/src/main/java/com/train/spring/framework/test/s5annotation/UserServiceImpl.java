package com.train.spring.framework.test.s5annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("userService")  //把userService加入ioc容器
//相当于：
@Service
public class UserServiceImpl implements UserService {
    //给对象注入属性可以使用@Resource或@AutoWired()
    //@Resource(name="userDao")  //会从ioc容器中找userDao对象，注入到当前字段;
    // 去容器中找UserDao类型的变量
    // 给对象注入属性（相当于根据名称查找,byName自动装配）


    //或者直接：
    @Resource  //如果(name="userDao")是缺省的，则自动按照byName的方式进行装配（且其默认name即为下面的属性名）。
    // 当找不到与名称匹配的bean时，才按照类型进行装配（此时容器中只能有一个Bean）。
    private UserDao userDao22;

    //因为UserDao类上标记@Component了，那么这注解就相当于<bean id="userDao" class="train.myspring.s5annotation.UserDao"/>
    //所以可以从IOC容器中找到下面所需的userDao
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
