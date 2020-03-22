package com.classsystem.classsystem.domain.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author WZY
 * @create 2020/3/22
 */
@ToString
@Data
public class UserLoginVo {

    private int userId;
    private int code;
    private String massage;

}
