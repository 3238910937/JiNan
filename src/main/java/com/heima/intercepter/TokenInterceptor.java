package com.heima.intercepter;

import com.heima.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

//@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1获取请求的路径
        String url = request.getRequestURL().toString();
        System.out.println("url" + url);

        // 3 获取请求头里的token信息
        String token = request.getHeader("token");
        if (!StringUtils.hasLength(token)) {
            // 设置响应码
            response.setStatus(HttpStatus.SC_UNAUTHORIZED);
            return false;
        }

        // 4 解析token
        try {
            JwtUtils.parseJWT(token);
        } catch (Exception e) {
            // 解析失败 说明token错误 或者是过期
            response.setStatus(HttpStatus.SC_UNAUTHORIZED);
            return false;
        }
        return true;
    }

}
