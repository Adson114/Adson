package com.curd.demo.service.Impl;

import com.curd.demo.dao.IUserDao;
import com.curd.demo.pojo.User;
import com.curd.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired(required=false)
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User get(Integer id) {
        return userDao.get(id);
    }

    @Override
    public Integer save(User user) {
        return userDao.save(user);
    }

    @Override
    public Integer delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public Integer update(User user) {
        return userDao.update(user);
    }
}
