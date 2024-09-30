package com.heima.mapper;

import com.heima.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //    实施登录
    User loginImplementuser(User user);
//    任务登录

    User loginTask(User user);
//    资源登录

    User loginResource(User user);
}
