package com.train.spring.framework.test.s6springIocApi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserAction {
    @Resource
    private UserService userService;

    public String execute() {
        userService.save();

        return null;
    }
}
