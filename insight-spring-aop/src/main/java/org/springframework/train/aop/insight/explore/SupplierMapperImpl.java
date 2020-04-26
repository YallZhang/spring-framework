package org.springframework.train.aop.insight.explore;

import org.springframework.beans.factory.InitializingBean;

public class SupplierMapperImpl implements InitializingBean {

    private UserMapperImpl userMapper;

    public UserMapperImpl getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapperImpl userMapper) {
        this.userMapper = userMapper;
    }

    public void insertSupplier(String supplierName) {
        System.out.println("新增一个供应商，名叫：" + supplierName);
    }

    public SupplierMapperImpl() {
        System.out.println("调用SupplierMapperImpl()构造函数");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("开始执行SupplierMapperImpl实现InitializingBean后的afterPropertiesSet方法");
    }

    public void initMethod() {
        System.out.println("开始对SupplierMapperImpl进行初始化");
    }

}
