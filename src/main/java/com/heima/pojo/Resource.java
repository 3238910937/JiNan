package com.heima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resource {
    private int logId;                  // 日志编号
    private String moduleName;          // 模块名称
    private String username;             // 用户名
    private String departmentName;       // 部门名称
    private Date operationDate;          // 操作日期
    private String ipAddress;            // IP 地址
    private String operationFunction;     // 操作功能
    private Date loginTime;              // 登录时间
    private String deviceTerminal;       // 设备终端名称
    private String operationStatus;      // 操作状态
    private Date logoutTime;             // 退出时间
    private Integer employeeId;
}