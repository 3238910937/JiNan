package com.heima.pojo;

import lombok.Data;

@Data
public class UserQueryParam {
    private String name;
    private Integer queryId;
    private Integer page = 1;
    private Integer pageSize = 10;
}
