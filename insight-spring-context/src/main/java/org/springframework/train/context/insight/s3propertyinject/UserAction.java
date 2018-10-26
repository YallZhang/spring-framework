package org.springframework.train.context.insight.s3propertyinject;

public class UserAction {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute(){
        userService.save();
        return null;
    }
}
