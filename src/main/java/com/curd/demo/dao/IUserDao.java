package com.curd.demo.dao;

import com.curd.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IUserDao {

    List< User> findAll();


    User get(@Param(value = "id") Integer id);


    Integer save(User user);


    Integer delete(@Param(value = "id") Integer id);


    Integer update(User user);
}
