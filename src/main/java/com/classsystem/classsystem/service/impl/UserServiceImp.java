package com.classsystem.classsystem.service.impl;

import com.classsystem.classsystem.domain.dto.UserDeleteDto;
import com.classsystem.classsystem.domain.dto.UserLoginDto;
import com.classsystem.classsystem.domain.dto.UserRegisterDto;
import com.classsystem.classsystem.domain.po.UserPo;
import com.classsystem.classsystem.domain.vo.UserLoginVo;
import com.classsystem.classsystem.mbg.mapper.UserDao;
import com.classsystem.classsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author WZY
 * @create 2020/3/18
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserPo loginUser(UserLoginDto userLoginDto) {
        return userDao.findUserByUserName(userLoginDto.getUsername());
    }

    @Override
    public Boolean registerUser(UserRegisterDto userRegisterDto) {
        return userDao.registerUser(userRegisterDto);
    }

    @Override
    public Boolean deleteUser(UserDeleteDto userDeleteDto) {
        return userDao.deleteUser(userDeleteDto);
    }
}
