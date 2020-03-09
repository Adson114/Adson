package com.curd.demo.service;

import com.curd.demo.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();


     User get(Integer id);


    Integer save(User user);


    Integer delete(Integer id);


    Integer update(User user);
}
