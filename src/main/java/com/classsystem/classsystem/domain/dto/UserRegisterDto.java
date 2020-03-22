package com.classsystem.classsystem.domain.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * @author WZY
 * @create 2020/3/19
 */
@Data
@ToString
public class UserRegisterDto {
    private String username;
    private String password;
    private int type;


}
