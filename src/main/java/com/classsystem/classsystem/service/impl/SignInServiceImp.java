package com.classsystem.classsystem.service.impl;

import com.classsystem.classsystem.domain.dto.SignInDto;
import com.classsystem.classsystem.mbg.mapper.SignInDao;
import com.classsystem.classsystem.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/22
 */
@Service
public class SignInServiceImp implements SignInService {

    @Autowired
    private SignInDao signInDao;


    @Override
    public Boolean SignInStudent(SignInDto signInDto) {
        signInDto.setSignInTime(new Date());
        return signInDao.signInStudent(signInDto);
    }
}
