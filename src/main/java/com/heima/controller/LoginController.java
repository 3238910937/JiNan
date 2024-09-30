package com.heima.controller;

import com.heima.pojo.LoginInfo;
import com.heima.pojo.Result;
import com.heima.pojo.User;
import com.heima.service.LoginService;
import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;
    //登录
    @PostMapping
    public Result login(@RequestBody User user) {
        LoginInfo loginInfo = userService.login(user);
        if (loginInfo == null) {
            return Result.error("用户名密码错误");
        } else {
            return Result.success(loginInfo);
        }
    }

    //    实施登录
    @PostMapping("/loginImplement")
    public Result loginImplement(@RequestBody User user) {
        LoginInfo loginInfo = loginService.loginImplement(user);
        if (loginInfo == null) {
            return Result.error("用户名密码错误");
        } else {
            return Result.success(loginInfo);
        }
    }

    //    任务登录
    @PostMapping("/loginTask")
    public Result loginTask(@RequestBody User user) {
        LoginInfo loginInfo = loginService.loginTask(user);
        if (loginInfo == null) {
            return Result.error("用户名密码错误");
        } else {
            return Result.success(loginInfo);
        }
    }

    //    资源登录
    @PostMapping("/loginResource")
    public Result loginResource(@RequestBody User user) {
        LoginInfo loginInfo = loginService.loginResource(user);
        if (loginInfo == null) {
            return Result.error("用户名密码错误");
        } else {
            return Result.success(loginInfo);
        }
    }

}
