package com.xs.springboot.dao;

import org.springframework.stereotype.Component;

@Component //标识当前类交给spring去new,交给spring进行管理。spring组件———bean
public class UserDao implements IUserDao{

    @Override
    public void getUser() {
        System.out.println("hello spring");
    }
}
