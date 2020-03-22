package com.classsystem.classsystem.mbg.model;

import lombok.Data;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Data
public class Course {

    private int id;
    private String courseName;
    private String homework;
    private int userId;
    private int exist;
    private String courseIntro;
    private Date addTime;
    private Date signInTime;

}
