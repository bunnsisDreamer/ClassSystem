package com.classsystem.classsystem.domain.po;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Data
@ToString
public class CoursePo {
    private int id;
    private String courseName;
    private String homework;
    private int userId;
    private int exist;
    private String courseIntro;
    private Date addtime;
    private Date signInTime;
}
