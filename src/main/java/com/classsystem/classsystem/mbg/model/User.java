package com.classsystem.classsystem.mbg.model;

import lombok.Data;

import java.sql.Date;

/**
 * @author WZY
 * @create 2020/3/18
 */

@Data
public class User {
    private String username;
    private String password;
    private int id;
    private int type;
    private Date addTime;
    private int dieTime;



}
