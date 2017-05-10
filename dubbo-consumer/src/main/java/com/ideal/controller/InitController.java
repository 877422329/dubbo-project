package com.ideal.controller;

import com.ideal.service.UserService;

/**
 * Init
 *
 * @author liucs
 * @date 2017-05-08-16:33
 */
public class InitController {

    private UserService userService;

    public InitController(UserService userService) {
        this.userService = userService;
    }

    public void start() {
        System.out.println(userService.queryById("1"));
        System.out.println(userService.queryUserName("2"));
    }
}
