package com.yyz.www.spring.aop.code.part0.service.impl;

import com.yyz.www.spring.aop.code.part0.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by yaoyunzhe on 2017-03-20.
 */
@Service
public class UserService implements IUserService {

    @Override
    public int addUser(String name, int age) {
        //省略诸如操作数据库等复杂的逻辑操作
        System.out.println("add user "+ name +" successfully");
        return 1;
    }

    @Override
    public void deleteUser(String name) {
        //省略诸如操作数据库等复杂的逻辑操作
        System.out.println("deleted one user named " + name);
        //throw new RuntimeException("这是特意抛出的异常信息！");
    }
}