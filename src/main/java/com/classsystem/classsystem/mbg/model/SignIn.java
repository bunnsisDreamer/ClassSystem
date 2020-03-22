package com.classsystem.classsystem.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/22
 */
@Data
@ToString
public class SignIn {
    private int id;
    private int userId;
    private Date signInTime;
    private int courseId;

}
