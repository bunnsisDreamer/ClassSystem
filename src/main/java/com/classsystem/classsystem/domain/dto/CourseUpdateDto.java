package com.classsystem.classsystem.domain.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author WZY
 * @create 2020/3/20
 */
@Data
@ToString
public class CourseUpdateDto {

    private int userId;
    private String homework;
    private String courseIntro;
    private String courseName;

}
