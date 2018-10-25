package com.train.spring.framework.test.enums;

public enum Operator {
    ADMINSTRATOR("ADMINSTRATOR", "管理员"),
    CALL_CENTER("CALL_CENTER", "呼叫中心"),
    EMPLOYEE("EMPLOYEE", "员工");

    private String systemName;
    private String desc;

    private Operator(String systemName, String desc) {
        this.systemName = systemName;
        this.desc = desc;
    }

    public String getSystemName() {
        return this.systemName;
    }
}
