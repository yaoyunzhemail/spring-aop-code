package com.yyz.www.spring.aop.code.part0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yyz.www.spring.aop.code.part0.service.IUserService;

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
