package com.classsystem.classsystem.mbg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {

    private int id;
    private String courseName;
    private String homework;
    private int userId;
    private int exist;
    private String courseIntro;
    private Date addTime;
    private Date signInTime;

}
