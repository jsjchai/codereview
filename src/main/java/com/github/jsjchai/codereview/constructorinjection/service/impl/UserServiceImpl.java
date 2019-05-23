package com.github.jsjchai.codereview.constructorinjection.service.impl;

import com.github.jsjchai.codereview.constructorinjection.dao.UserDao;
import com.github.jsjchai.codereview.constructorinjection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jsjchai.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    //构造方法注入,@Autowired可省略
    public UserServiceImpl(@Autowired  UserDao userDao){
        this.userDao = userDao;
    }

}
