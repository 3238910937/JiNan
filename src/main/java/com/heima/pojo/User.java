package com.heima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer id;
    private String username;
    private Integer adminCategory;
    private String name;
    private Integer departmentName;
    private Integer status;
    private String password;
    private String jobName;
    private Integer jobCategory;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;
    private LocalDate updateDate;
    private LocalDate createDate;

}
