package com.xs.service;

import com.xs.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //标识当前类交给spring去new,交给spring进行管理。spring组件———bean
public class UserService implements IUserService{
    //依赖spring注入(DI)
    @Autowired //让spring自动注入进来
    IUserDao userDao;



    @Override
    public void getUser() {
        userDao.getUser();
    }
}
