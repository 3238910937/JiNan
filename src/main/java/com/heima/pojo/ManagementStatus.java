package com.heima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ManagementStatus {
    private int id;
    private Integer userId;                 // 用户id
    private Integer orgManagement;
    private Integer contractManagement;
    private Integer databaseManagement;
    private Integer userManagement;
    private Integer infoManagement;
    private Integer appointmentManagement;
    private Integer statisticalAnalysis;
    private Integer systemLogs;
    private Integer businessOpportunities;
    private Integer afterSalesLogs;
    private Integer systemIntegration;
    private Integer logManagement;
    private Integer taskList;
    private Integer permissionManagement;
    private Integer productManagement;
    private Integer employeeManagement;
    private Integer systemConfiguration;
}