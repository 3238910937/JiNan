package com.heima.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OperationPermissions {
    private Integer id;                       // 主键
    private Integer userId;                 // 用户id
    private Integer createPermission;     // 创建权限
    private Integer grantPermission;       // 授权权限
    private Integer editPermission;        // 编辑权限
    private Integer deletePermission;      // 删除权限
    private Integer viewPermission;        // 查看权限
    private Integer searchPermission;      // 搜索权限
}
