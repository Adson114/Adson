package com.curd.demo.mapper;

import com.curd.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List< User> findAll();

    @Select("select * from user where id=#{id}")
    public User get(Integer id);

    @Insert("insert into user (name) values (#{name})")
    Integer save(User user);

    @Delete("delete from user where id=#{id}")
    void delete(Integer id);

    @Update("update user set name=#{name} where id=#{id}")
    Integer update(User user);
}
