package com.heima.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Task {
    private int taskId;                  // 任务编号
    private String organizationName;     // 机构名称
    private String taskType;             // 任务类型
    private String taskDetails;          // 任务详情
    private String projectName;          // 项目名称
    private String taskStatus;           // 任务状态
    private String taskLevel;            // 任务级别
    private String taskMembers;          // 任务成员
    private String taskDepartment;       // 任务部门
    private String contactPerson;        // 联系人
    private String publisher;            // 发布人
    private java.sql.Date publishDate;   // 发布日期
    private java.sql.Date startDate;     // 开始日期
    private java.sql.Date endDate;       // 结束日期
    private int employeeId;              // 员工ID
}