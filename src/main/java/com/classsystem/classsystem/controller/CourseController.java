package com.classsystem.classsystem.controller;

import com.classsystem.classsystem.domain.dto.CourseReleaseDto;
import com.classsystem.classsystem.domain.dto.CourseSignInTimeDto;
import com.classsystem.classsystem.domain.dto.CourseUpdateDto;
import com.classsystem.classsystem.service.CourseService;
import com.classsystem.classsystem.utils.response.Response;
import com.classsystem.classsystem.utils.response.ResponseEntity;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
