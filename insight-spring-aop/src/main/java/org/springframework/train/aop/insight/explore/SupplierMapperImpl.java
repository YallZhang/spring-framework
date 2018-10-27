package org.springframework.train.aop.insight.explore;

public class SupplierMapperImpl {
    public void insertSupplier(String supplierName) {
        System.out.println("新增一个供应商，名叫：" + supplierName);
    }
}
