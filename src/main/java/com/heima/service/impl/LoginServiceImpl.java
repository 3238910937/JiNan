package com.heima.service.impl;

import com.heima.mapper.LoginMapper;
import com.heima.pojo.LoginInfo;
import com.heima.pojo.User;
import com.heima.service.LoginService;
import com.heima.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    //    实施登录
    @Override
    public LoginInfo loginImplement(User user) {
        User u = loginMapper.loginImplementuser(user);
        if (u != null) {
            Map map = new HashMap();
            map.put("username", u.getUsername());
            map.put("id", u.getId());
            // 生成token
            String token = JwtUtils.generateJwt(map);
            LoginInfo loginInfo = new LoginInfo(u.getId(), u.getUsername(), u.getName(), token);
            return loginInfo;
        } else {
            return null;
        }
    }

    //    任务登录
    @Override
    public LoginInfo loginTask(User user) {
        User u = loginMapper.loginTask(user);
        if (u != null) {
            Map map = new HashMap();
            map.put("username", u.getUsername());
            map.put("id", u.getId());
            // 生成token
            String token = JwtUtils.generateJwt(map);
            LoginInfo loginInfo = new LoginInfo(u.getId(), u.getUsername(), u.getName(), token);
            return loginInfo;
        } else {
            return null;
        }
    }

    //    资源登录
    @Override
    public LoginInfo loginResource(User user) {
        User u = loginMapper.loginResource(user);
        if (u != null) {
            Map map = new HashMap();
            map.put("username", u.getUsername());
            map.put("id", u.getId());
            // 生成token
            String token = JwtUtils.generateJwt(map);
            LoginInfo loginInfo = new LoginInfo(u.getId(), u.getUsername(), u.getName(), token);
            return loginInfo;
        } else {
            return null;
        }
    }
}
