package com.heima.controller;

import com.heima.pojo.Implement;
import com.heima.pojo.Resource;
import com.heima.pojo.Result;
import com.heima.pojo.Task;
import com.heima.service.InterconnectionManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interconnect")
public class InterconnectionManagement {
    @Autowired
    private InterconnectionManagementService interconnectionManagementService;

    //    任务查询
    @GetMapping("/Task")
    public Result getTask(@RequestParam Integer id,@RequestParam Integer employeeId) {
        Task task = interconnectionManagementService.getTask(id, employeeId);
        return Result.success(task);
    }

    //资源查询
    @GetMapping("/Resource")
    public Result getResource(@RequestParam Integer id,@RequestParam Integer employeeId) {
        Resource resource = interconnectionManagementService.getResource(id, employeeId);
        return Result.success(resource);
    }

    //实施查询
    @GetMapping("/Implement")
    public Result getImplement(@RequestParam Integer id,@RequestParam Integer employeeId) {
        Implement implement = interconnectionManagementService.getImplement(id,employeeId);
        return Result.success(implement);
    }


}
