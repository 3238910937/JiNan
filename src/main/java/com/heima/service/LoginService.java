package com.heima.service;

import com.heima.pojo.LoginInfo;
import com.heima.pojo.User;

public interface LoginService {
    //    实施登录
    LoginInfo loginImplement(User user);

    //    任务登录
    LoginInfo loginTask(User user);

    //    资源登录
    LoginInfo loginResource(User user);
}
