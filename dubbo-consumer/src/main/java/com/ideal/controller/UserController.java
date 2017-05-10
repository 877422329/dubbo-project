package com.ideal.controller;

import com.ideal.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户操作
 *
 * @author liucs
 * @date 2017-05-08-14:38
 */
public interface UserController {

    String queryUserName(String userId);

    User queryUser(String userId);
}
