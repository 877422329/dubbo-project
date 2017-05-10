package com.ideal.controller.impl;

import com.ideal.controller.UserController;
import com.ideal.pojo.User;
import com.ideal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户操作实现类
 *
 * @author liucs
 * @date 2017-05-08-14:39
 */
@Controller
@RequestMapping(value = "/user")
public class UserControllerImpl implements UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/{userId}/name", method = {RequestMethod.GET}, produces = "text/html;charset=utf-8")
    @Override
    public @ResponseBody
    String queryUserName(@PathVariable("userId") String userId) {
        return userService.queryUserName(userId);
    }

    @RequestMapping(value = "/{userId}/user", method = {RequestMethod.GET})
    @Override
    public @ResponseBody
    User queryUser(@PathVariable("userId") String userId) {
        return userService.queryById(userId);
    }

    @RequestMapping(value = "/{userId}/hello", method = {RequestMethod.GET})
    public String hello(@PathVariable("userId") String userId) {
        System.out.println("userId=" + userId);
        return "index";
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String hello1(@RequestParam("userId") String userId) {
        System.out.println("userId=" + userId);
        return "index";
    }

    @RequestMapping(value = "/{userId}/{username}/login", method = RequestMethod.GET)
    public @ResponseBody String login(@PathVariable("userId") String userId, @PathVariable("username") String username) {
        return userService.login(userId, username);
    }

}
