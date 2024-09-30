package com.heima.service;

import com.heima.pojo.LoginInfo;
import com.heima.pojo.PageBean;
import com.heima.pojo.User;
import com.heima.pojo.UserQueryParam;

import java.util.List;

public interface UserService {
    //   查找全部用户数据
    List<User> findAll();

    void add(User user);

    //    分页查询
    PageBean findPageBean(UserQueryParam userQueryParam);

    //根据姓名查人
    User findByName(String name);

    //    更新用户权限
    void updateUserRights(User user);

    //    更新用户资料
    void updateUserInfo(User user);

    //    根据id查询用户
    User getIdInfo(Integer id);

    //    查看用户资料
    User getUserAllInfo(Integer id);

    //    删除用户
    void deletedeleteUser(Integer id);

    //登录
    LoginInfo login(User user);

}
