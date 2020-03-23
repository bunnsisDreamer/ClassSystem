package com.classsystem.classsystem.domain.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author WZY
 * @create 2020/3/23
 */
@ToString
@Data
public class ManagementUpdateUserDto {
    private String username;
    private String password;
    private int type;

}
