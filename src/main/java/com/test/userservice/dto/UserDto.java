package com.test.userservice.dto;


import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private String email;
    private String name;
    private String pdw;
    private String userId;
    private Date createAt;
    private String encryptedPwd;

}
