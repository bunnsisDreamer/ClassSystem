package com.classsystem.classsystem.service;

import com.classsystem.classsystem.domain.dto.SignInDto;

/**
 * @author WZY
 * @create 2020/3/22
 */
public interface SignInService {

    //学生签到
    Boolean SignInStudent(SignInDto signInDto);
}
