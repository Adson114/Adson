package com.curd.demo.controller;

import com.curd.demo.mapper.UserMapper;
import com.curd.demo.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired(required = false)
     UserMapper userMapper;

    @RequestMapping("/addUser")
    public String addUser(User user){
        userMapper.save(user);
        return  "redirect:listUser";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(User user){
        userMapper.delete(user.getId());
        return  "redirect:listUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userMapper.update(user);
        return  "redirect:listUser";
    }

    @RequestMapping("/findUser")
    public String findUser(Integer id, Model model){
        User user=userMapper.get(id);
        model.addAttribute("user",user);
        return  "edituser";
    }

    @RequestMapping("/listUser")
    public String listUser(Model model, @RequestParam(value = "start",defaultValue = "0")Integer start,
                           @RequestParam(value = "size",defaultValue = "30")Integer size){
        PageHelper.startPage(start,size,"id asc");
        List<User>userList=userMapper.findAll();
        PageInfo<User>page=new PageInfo<>(userList);
        model.addAttribute("pages",page);
        return "listuser";
    }
}
