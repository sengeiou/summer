package com.summer.service.org.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String foobar() {
        return null;
    }

    @Override
    public UserQueryDto findUser() {
        return null;
    }

}
