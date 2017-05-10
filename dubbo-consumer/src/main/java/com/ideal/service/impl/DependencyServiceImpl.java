package com.ideal.service.impl;

import com.ideal.pojo.User;
import com.ideal.service.DependencyService;
import com.ideal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 依赖关系服务
 *
 * @author liucs
 * @date 2017-05-09-15:12
 */
public class DependencyServiceImpl implements DependencyService {

    @Override
    public String login(String userId, String username) {
        if (userId.equals("1") && username.contains("zhang"))
            return "true";
        return "false";
    }
}
