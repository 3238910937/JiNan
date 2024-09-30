package com.heima.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {


    private static Long expire = 43200000L;
    private static String JWT_KEY = "JWT_SECRET";

    //存环境变量 用管理员打开cmd
    //set JWT_SECRET = SVRIRUlNQQ==
    //setx JWT_SECRET  SVRIRUlNQQ==

    /**
     * 生成JWT令牌
     *
     * @return
     */
    public static String generateJwt(Map<String, Object> claims) {
        String signKey = System.getenv(JWT_KEY);
        String jwt = Jwts.builder()
                .addClaims(claims)
                .signWith(SignatureAlgorithm.HS256, signKey)
                .setExpiration(new Date(System.currentTimeMillis() + expire))
                .compact();
        return jwt;
    }

    public static void main(String[] args) {
        generateJwt(new HashMap<>());
    }

    /**
     * 解析JWT令牌
     *
     * @param jwt JWT令牌
     * @return JWT第二部分负载 payload 中存储的内容
     */
    public static Claims parseJWT(String jwt) {
        String signKey = System.getenv(JWT_KEY);
        Claims claims = Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(jwt)
                .getBody();
        return claims;
    }
}
