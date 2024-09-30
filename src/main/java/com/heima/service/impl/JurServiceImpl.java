package com.heima.service.impl;

import com.heima.mapper.JurMapper;
import com.heima.pojo.ManagementStatus;
import com.heima.pojo.OperationPermissions;
import com.heima.service.JurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JurServiceImpl implements JurService {

    @Autowired
    private JurMapper jurMapper;

    //添加栏目权限
    @Override
    public void addColumnJur(ManagementStatus managementStatus) {
        jurMapper.addColumnJur(managementStatus);
    }

    //添加操作权限
    @Override
    public void addOperationJur(OperationPermissions operationPermissions) {
        jurMapper.addOperationJur(operationPermissions);
    }
    //        查看用户栏目权限
    @Override
    public ManagementStatus getUserColumnJur(Integer id) {
        ManagementStatus managementStatus = jurMapper.getUserColumnJur(id);
        return managementStatus;
    }
    //    查看用户操作权限
    @Override
    public OperationPermissions getUserOperationJur(Integer id) {
        OperationPermissions operationPermissions = jurMapper.getUserOperationJur(id);
        return operationPermissions;
    }
}
