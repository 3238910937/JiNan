package com.heima.service.impl;

import com.heima.mapper.InterconnectionManagementMapper;
import com.heima.pojo.Implement;
import com.heima.pojo.Resource;
import com.heima.pojo.Task;
import com.heima.service.InterconnectionManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterconnectionManagementServiceImpl implements InterconnectionManagementService {
    @Autowired
    InterconnectionManagementMapper interconnectionManagementMapper;

    //    任务查询
    @Override
    public Task getTask(Integer id, Integer employeeId) {

        Task task = interconnectionManagementMapper.getTask(id,employeeId);
        return task;
    }
    //资源查询

    @Override
    public Resource getResource(Integer id, Integer employeeId) {
        Resource resource = interconnectionManagementMapper.getResource(id,employeeId);
        return resource;
    }
    //实施查询

    @Override
    public Implement getImplement(Integer id,Integer employeeId) {
        Implement implement = interconnectionManagementMapper.getImplement(id,employeeId);
        return implement;
    }
}
