package com.classsystem.classsystem.domain.po;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/18
 */

@ToString
@Data
public class UserPo {
    private String username;
    private String password;
    private int type;
    private int id;
    private Date addTime;
    private int die;
}
