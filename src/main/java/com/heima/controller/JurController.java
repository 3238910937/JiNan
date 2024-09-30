package com.heima.controller;

import com.heima.pojo.ManagementStatus;
import com.heima.pojo.OperationPermissions;
import com.heima.pojo.Result;
import com.heima.service.JurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/jur")
@RestController
public class JurController {
    @Autowired
    JurService jurService;

    //添加栏目权限
    @PostMapping("/column")
    public Result addColumnJur(@RequestBody ManagementStatus managementStatus) {
        jurService.addColumnJur(managementStatus);
        return Result.success();
    }

    //添加操作权限
    @PostMapping("/operation")
    public Result addOperationJur(@RequestBody OperationPermissions operationPermissions) {
        jurService.addOperationJur(operationPermissions);
        return Result.success();

    }

    //查看用户栏目权限
    @GetMapping("/getUserColumnJur")
    public Result getUserColumnJur(@RequestParam Integer id) {
        return Result.success(jurService.getUserColumnJur(id));
    }

    //查看用户操作权限
    @GetMapping("/getUserOperationJur")
    public Result getUserOperationJur(@RequestParam Integer id) {
        return Result.success(jurService.getUserOperationJur(id));
    }


}
