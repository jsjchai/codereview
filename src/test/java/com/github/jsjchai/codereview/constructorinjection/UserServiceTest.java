package com.github.jsjchai.codereview.constructorinjection;

import com.github.jsjchai.codereview.constructorinjection.service.LoginService;
import com.github.jsjchai.codereview.constructorinjection.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jsjchai.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @Test
    public void test(){
        Assert.assertNotNull(userService);
        Assert.assertNotNull(loginService);
    }
}
