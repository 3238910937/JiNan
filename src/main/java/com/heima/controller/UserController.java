package com.heima.controller;

import com.heima.pojo.PageBean;
import com.heima.pojo.Result;
import com.heima.pojo.User;
import com.heima.pojo.UserQueryParam;
import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    //  查找全部用户数据
    @GetMapping
    public Result findAll() {
        List<User> users = userService.findAll();
        return Result.success(users);
    }

    // 添加用户
    @PostMapping
    public Result add(@RequestBody User user) {
        userService.add(user);
        return Result.success();
    }

    //    分页查询
    @GetMapping("/findPageBean")
    public Result findPageBean(@RequestBody UserQueryParam userQueryParam) {
        PageBean pageBeanList = userService.findPageBean(userQueryParam);
        return Result.success(pageBeanList);
    }

    //根据姓名查人
    @GetMapping("/findByName")
    public Result findByName(String name) {
        User user = userService.findByName(name);
        return Result.success(user);
    }

    //    更新用户权限
    @PutMapping("/updateUserRights")
    public Result updateUserRights(@RequestBody User user) {
        userService.updateUserRights(user);
        return Result.success();
    }

    //    更新用户资料
    @PutMapping("/updateUserInfo")
    public Result updateUserInfo(@RequestBody User user) {
        userService.updateUserInfo(user);
        return Result.success();
    }

    //    根据id查询用户
    @GetMapping("/{id}")
    public Result getIdInfo(@PathVariable Integer id) {
        User user = userService.getIdInfo(id);
        return Result.success(user);
    }

    //    查看用户资料
    @GetMapping("/getUserAllInfo/{id}")
    public Result getUserAllInfo(@PathVariable Integer id) {
        User user = userService.getUserAllInfo(id);
        return Result.success(user);
    }

    //    删除用户
    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Integer id) {
        userService.deletedeleteUser(id);
        return Result.success();
    }
}



