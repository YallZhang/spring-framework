package org.springframework.train.aop.insight.explore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class UserMapperImpl implements UserMapper, InitializingBean, DisposableBean {

    private String userName;
    private Integer age;

    //todo:测试循环依赖
    private SupplierMapperImpl supplierMapperImpl;
    private List<Integer> scoreList;

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Integer> scoreList) {
        this.scoreList = scoreList;
    }

    public SupplierMapperImpl getSupplierMapperImpl() {
        return supplierMapperImpl;
    }

    public void setSupplierMapperImpl(SupplierMapperImpl supplierMapperImpl) {
        this.supplierMapperImpl = supplierMapperImpl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("UserMapperImpl 开始了设置属性setUserName:" + userName);
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("UserMapperImpl 开始了设置属性setAge:" + age);
        this.age = age;
    }

    public UserMapperImpl() {
        System.out.println("开始执行UserMapperImpl()构造方法");
    }

    @Override
    public int insertUser(String name) {
        System.out.println("添加成功,添加的User用户是：" + name);
        return 1;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("设置完属性后开始执行UserMapperImpl实现的InitializingBean的afterPropertiesSet()方法");
    }

    public void initMethod() {
        System.out.println("开始执行UserMapperImpl的initMethod()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("UserMapperImpl 实现了DisposableBean接口，执行其destroy()方法 (在applicationContext.destory时会触发这个)");
    }
}
