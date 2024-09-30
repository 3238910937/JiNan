package com.heima.mapper;

import com.heima.pojo.Implement;
import com.heima.pojo.Resource;
import com.heima.pojo.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InterconnectionManagementMapper {
    //    任务查询
    Task getTask(@Param("id") Integer id, @Param("employeeId") Integer employeeId);

    //资源查询
    Resource getResource(@Param("id") Integer id, @Param("employeeId") Integer employeeId);

    //实施查询
    Implement getImplement(@Param("id") Integer id, @Param("employeeId") Integer employeeId);
}
