package com.yyz.www.spring.aop.code.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yyz.www.spring.aop.code.part1.service.IUserService;

/**
 * Created by yaoyunzhe on 2017-03-20.
 */
@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private IUserService        userService;

    @Override
    public void run(String... args) throws Exception {
        userService.addUser("ton", 56);
        userService.deleteUser("ton");
    }
}
