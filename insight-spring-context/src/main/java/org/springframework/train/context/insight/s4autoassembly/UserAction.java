package org.springframework.train.context.insight.s4autoassembly;

public class UserAction {
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute() {
        userService.save();
        return null;
    }
}
