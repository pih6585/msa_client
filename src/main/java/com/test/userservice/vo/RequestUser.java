package com.test.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Data
public class RequestUser {

    @NotNull
    @Email
    private String email;

    @NotNull
    private String name;

    @NotNull
    private String pwd;

}
