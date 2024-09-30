package com.heima.mapper;

import com.heima.pojo.User;
import com.heima.pojo.UserQueryParam;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //查找全部用户数据
    @Select("select * from users")
    List<User> findAll();

    //  添加用户
    void add(User user);

    //分页查询
    List<User> findPageBean(UserQueryParam userQueryParam);

    //根据姓名查人
    @Select("select * from  users where name = #{name}")
    User findByName(String name);

    //    根据id查询用户
    @Select("select * from users where id = #{id}")
    User getIdInfo(Integer id);

    //    更新用户权限
    void updateUserRights(User user);

    //    更新用户资料
    void updateUserInfo(User user);

    //    查看用户资料
    User getUserAllInfo(Integer id);

    //    删除用户
    @Delete("delete from users where id = #{id}")
    void deletedeleteUser(Integer id);

    //登录
    User findEmpByPassword(User user);
}
