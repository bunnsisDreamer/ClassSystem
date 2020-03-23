package com.classsystem.classsystem.service.impl;

import com.classsystem.classsystem.domain.dto.*;
import com.classsystem.classsystem.domain.vo.CourseGetVo;
import com.classsystem.classsystem.domain.vo.CourseSelectGetVo;
import com.classsystem.classsystem.mbg.mapper.CourseDao;
import com.classsystem.classsystem.mbg.mapper.SelectCourseDao;
import com.classsystem.classsystem.mbg.model.SelectCourse;
import com.classsystem.classsystem.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Autowired
    private SelectCourseDao selectCourseDao;

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

    @Override
    public List<CourseGetVo> getCourseByUserId(CourseGetDto courseGetDto) {
        return courseDao.getCourseByUserId(courseGetDto.getUserId());
    }

    @Override
    public List<CourseGetVo> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public Boolean selectCourse(CourseSelectDto courseSelectDto) {
        return selectCourseDao.selectCourse(courseSelectDto);
    }

    @Override
    public List<CourseSelectGetVo> getSelectCourse(CourseSelectGetDto courseSelectGetDto) {
        return courseDao.getSelectCourse(courseSelectGetDto);
    }
}
