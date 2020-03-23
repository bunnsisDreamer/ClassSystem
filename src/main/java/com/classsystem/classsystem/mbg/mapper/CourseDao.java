package com.classsystem.classsystem.mbg.mapper;

import com.classsystem.classsystem.domain.dto.*;
import com.classsystem.classsystem.domain.vo.CourseGetVo;
import com.classsystem.classsystem.domain.vo.CourseSelectGetVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Repository
public interface CourseDao {

    boolean releaseCourse(CourseReleaseDto courseReleaseDto);

    boolean updateCourse(CourseUpdateDto courseUpdateDto);

    boolean signInTimeCourse(CourseSignInTimeDto courseSignInTimeDto);

    List<CourseGetVo> getCourseByUserId(Integer userId);

    List<CourseGetVo> getAllCourse();

    List<CourseSelectGetVo> getSelectCourse(CourseSelectGetDto courseSelectGetDto);

}
