package com.classsystem.classsystem.domain.vo;

import jdk.internal.instrumentation.TypeMapping;
import lombok.Data;
import lombok.ToString;

/**
 * @author WZY
 * @create 2020/3/23
 */
@ToString
@Data
public class CourseGetVo {

    private int code;
    private String massage;
    private int userId;
    private int courseId;
    private String courseName;
    private String homework;
    private String courseIntro;

}
