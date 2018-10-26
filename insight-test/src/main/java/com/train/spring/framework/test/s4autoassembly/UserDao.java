package com.train.spring.framework.test.s4autoassembly;


import java.util.List;
import java.util.Map;

public class UserDao {


    /**
     * 可以这样指定map: 直接单独定义多个User，然后在<bean id="userDao">中需指定autowire==byType属性。这样才能自动将User们注入到这个map中。
     * 但是！！如果同时定义了多个User，有的User并不想被注入到map中，那就应该格外注意了
     */
    private Map<String, User> map;

    /**
     * List同理
     */
    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public void save() {
        System.out.println("DB:保存用户");
    }

    public void killDao() {

        System.out.println("销毁这个Dao");
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "map=" + map +
                ", list=" + list +
                '}';
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }
}
