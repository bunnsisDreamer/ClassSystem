package com.classsystem.classsystem.service.impl;

import com.classsystem.classsystem.domain.dto.CourseReleaseDto;
import com.classsystem.classsystem.domain.dto.CourseSignInTimeDto;
import com.classsystem.classsystem.domain.dto.CourseUpdateDto;
import com.classsystem.classsystem.mbg.mapper.CourseDao;
import com.classsystem.classsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public Boolean releaseCourse(CourseReleaseDto courseReleaseDto) {
        return courseDao.releaseCourse(courseReleaseDto);
    }

    @Override
    public Boolean updateCourse(CourseUpdateDto courseUpdateDto) {
        return courseDao.updateCourse(courseUpdateDto);
    }

    @Override
    public Boolean signInTimeCourse(CourseSignInTimeDto courseSignInTimeDto) {
        return courseDao.signInTimeCourse(courseSignInTimeDto);
    }
}
