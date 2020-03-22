package com.classsystem.classsystem.service;

import com.classsystem.classsystem.domain.dto.CourseReleaseDto;
import com.classsystem.classsystem.domain.dto.CourseSignInTimeDto;
import com.classsystem.classsystem.domain.dto.CourseUpdateDto;

/**
 * @author WZY
 * @create 2020/3/19
 */
public interface CourseService {

    //发布课程
    Boolean releaseCourse(CourseReleaseDto courseReleaseDto);

    //修改课程(作业)
    Boolean updateCourse(CourseUpdateDto courseUpdateDto);

    //发布签到
    Boolean signInTimeCourse(CourseSignInTimeDto courseSignInTimeDto);
}
