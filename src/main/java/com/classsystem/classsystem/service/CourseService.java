package com.classsystem.classsystem.service;

import com.classsystem.classsystem.domain.dto.*;
import com.classsystem.classsystem.domain.vo.CourseGetVo;
import com.classsystem.classsystem.domain.vo.CourseSelectGetVo;

import java.util.List;

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

    //获得自己管理的课程
    List<CourseGetVo> getCourseByUserId(CourseGetDto courseGetDto);

    //获得所有课程
    List<CourseGetVo> getAllCourse();

    //学生选择课程
    Boolean selectCourse(CourseSelectDto courseSelectDto);

    //学生获得自己所选的课程
    List<CourseSelectGetVo> getSelectCourse(CourseSelectGetDto courseSelectGetDto);
}
