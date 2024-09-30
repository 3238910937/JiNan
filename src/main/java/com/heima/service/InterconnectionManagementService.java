package com.heima.service;

import com.heima.pojo.Implement;
import com.heima.pojo.Resource;
import com.heima.pojo.Task;

public interface InterconnectionManagementService {
    //    任务查询

    Task getTask(Integer id, Integer employeeId);
    //资源查询

    Resource getResource(Integer id, Integer employeeId);
    //实施查询

    Implement getImplement(Integer id,Integer employeeId);
}
