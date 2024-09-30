package com.heima.exception;

import com.heima.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // 处理异常
    @ExceptionHandler
    public Result ex(Exception e){// 方法形参中指定能够处理的异常类型
        e.printStackTrace();
        return Result.error("对不起,操作失败,请联系管理员");
    }
}