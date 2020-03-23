package com.classsystem.classsystem.controller;

import com.classsystem.classsystem.domain.dto.*;
import com.classsystem.classsystem.domain.vo.CourseGetVo;
import com.classsystem.classsystem.domain.vo.CourseSelectGetVo;
import com.classsystem.classsystem.service.CourseService;
import com.classsystem.classsystem.utils.response.Response;
import com.classsystem.classsystem.utils.response.ResponseEntity;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WZY
 * @create 2020/3/19
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/release")
    public ResponseEntity releaseCourse(@RequestBody CourseReleaseDto courseReleaseDto){
        if(courseService.releaseCourse(courseReleaseDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }

    @PostMapping("/update")
    public ResponseEntity updateCourse(@RequestBody CourseUpdateDto courseUpdateDto){
        if(courseService.updateCourse(courseUpdateDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }

    @PostMapping("/signIn")
    public ResponseEntity signInTimeCourse(@RequestBody CourseSignInTimeDto courseSignInTimeDto){
        if(courseService.signInTimeCourse(courseSignInTimeDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }

    @PostMapping("/get")
    public List<CourseGetVo> getCourse(@RequestBody CourseGetDto courseGetDto){
        return courseService.getCourseByUserId(courseGetDto);
    }

    @GetMapping("/getAll")
    public List<CourseGetVo> getAllCourse(){
        return courseService.getAllCourse();
    }

    @PostMapping("/select")
    public ResponseEntity selectCourse(@RequestBody CourseSelectDto courseSelectDto){
        if(courseService.selectCourse(courseSelectDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }

    @PostMapping("getCourse")
    public List<CourseSelectGetVo> getSelectCourse(@RequestBody CourseSelectGetDto courseSelectGetDto){
        return courseService.getSelectCourse(courseSelectGetDto);
    }

}
