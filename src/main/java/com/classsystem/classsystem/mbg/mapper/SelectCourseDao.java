package com.classsystem.classsystem.mbg.mapper;

import com.classsystem.classsystem.domain.dto.CourseSelectDto;
import org.springframework.stereotype.Repository;

/**
 * @author WZY
 * @create 2020/3/23
 */
@Repository
public interface SelectCourseDao {

    boolean selectCourse(CourseSelectDto courseSelectDto);
}
