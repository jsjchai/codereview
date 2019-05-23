package com.github.jsjchai.codereview.constructorinjection.service.impl;

import com.github.jsjchai.codereview.constructorinjection.service.LoginService;
import com.github.jsjchai.codereview.constructorinjection.service.UserService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author jsjchai.
 */
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @NonNull
    private final UserService userService;
}
