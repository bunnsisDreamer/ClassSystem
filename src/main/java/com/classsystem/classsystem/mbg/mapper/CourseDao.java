package com.classsystem.classsystem.mbg.mapper;

import com.classsystem.classsystem.domain.dto.CourseReleaseDto;
import com.classsystem.classsystem.domain.dto.CourseSignInTimeDto;
import com.classsystem.classsystem.domain.dto.CourseUpdateDto;
import org.springframework.stereotype.Repository;

/**
 * @author WZY
 * @create 2020/3/19
 */
@Repository
public interface CourseDao {

    boolean releaseCourse(CourseReleaseDto courseReleaseDto);

    boolean updateCourse(CourseUpdateDto courseUpdateDto);

    boolean signInTimeCourse(CourseSignInTimeDto courseSignInTimeDto);
}
