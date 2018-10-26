package com.train.spring.framework.test.s5annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    public String execute() {
        userService.save();
        return null;
    }
}
