package org.springframework.train.aop.insight.explore;

public class UserMapperImpl implements UserMapper {
    @Override
    public int insertUser(String name) {
        System.out.println("添加成功,添加的User用户是：" + name);
        return 1;
    }
}
