package com.classsystem.classsystem.domain.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Data
@ToString
public class CourseReleaseDto {

    private String courseName;
    private int userId;
    private String courseIntro;
}
