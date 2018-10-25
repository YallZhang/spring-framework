package com.train.spring.framework.test.s5annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    //@Resource(name = "userService")
    //或者直接：
    @Resource
    private UserService userService;   //所以这里的属性写成userService2也可以运行。

    public String execute() {
        userService.save();
        return null;
    }
}
