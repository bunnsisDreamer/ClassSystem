package com.classsystem.classsystem.domain.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author WZY
 * @create 2020/3/23
 */
@ToString
@Data
public class ManagementGetUserVo {
    private String username;
    private String password;
    private int type;
    private int id;

}
