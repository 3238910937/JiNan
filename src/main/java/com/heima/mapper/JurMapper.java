package com.heima.mapper;

import com.heima.pojo.ManagementStatus;
import com.heima.pojo.OperationPermissions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JurMapper {
    //添加栏目权限
    void addColumnJur(ManagementStatus managementStatus);

    //添加操作权限
    void addOperationJur(OperationPermissions operationPermissions);

    //        查看用户栏目权限
    ManagementStatus getUserColumnJur(Integer id);

    //    查看用户操作权限
    OperationPermissions getUserOperationJur(Integer id);
}
