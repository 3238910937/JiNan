package com.heima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heima.mapper.UserMapper;
import com.heima.pojo.LoginInfo;
import com.heima.pojo.PageBean;
import com.heima.pojo.User;
import com.heima.pojo.UserQueryParam;
import com.heima.service.UserService;
import com.heima.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    //   查找全部用户数据
    @Override
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

    //添加用户
    @Override
    public void add(User user) {
        user.setCreateDate(LocalDate.now());
        user.setUpdateDate(LocalDate.now());
        user.setUpdateDateTime(LocalDateTime.now());
        user.setCreateDateTime(LocalDateTime.now());
        userMapper.add(user);
    }

    //分页查询
    @Override
    public PageBean findPageBean(UserQueryParam userQueryParam) {
        PageHelper.startPage(userQueryParam.getPage(), userQueryParam.getPageSize());
        List<User> userList = userMapper.findPageBean(userQueryParam);
        Page<User> p = (Page<User>) userList;

        return new PageBean(p.getTotal(), p.getResult());
    }

    //根据姓名查人
    @Override
    public User findByName(String name) {
        User user = userMapper.findByName(name);
        return user;
    }

    //    根据id查询用户
    @Override
    public User getIdInfo(Integer id) {
        User user = userMapper.getIdInfo(id);
        return user;

    }

    //    更新用户权限
    @Override
    public void updateUserRights(User user) {
        userMapper.updateUserRights(user);
    }

    //    更新用户资料
    @Override
    public void updateUserInfo(User user) {
        userMapper.updateUserInfo(user);
    }

    //    查看用户资料
    @Override
    public User getUserAllInfo(Integer id) {
        User user = userMapper.getUserAllInfo(id);
        return user;
    }

    //    删除用户
    @Override
    public void deletedeleteUser(Integer id) {
        userMapper.deletedeleteUser(id);
    }

    //登录
    @Override
    public LoginInfo login(User user) {
        User u = userMapper.findEmpByPassword(user);
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
