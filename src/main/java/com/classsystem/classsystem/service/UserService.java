package com.classsystem.classsystem.service;

import com.classsystem.classsystem.domain.dto.UserDeleteDto;
import com.classsystem.classsystem.domain.dto.UserLoginDto;
import com.classsystem.classsystem.domain.dto.UserRegisterDto;
import com.classsystem.classsystem.domain.po.UserPo;
import com.classsystem.classsystem.domain.vo.UserLoginVo;


/**
 * @author WZY
 * @create 2020/3/18
 */
public interface UserService {

    //用户登录
    UserPo loginUser(UserLoginDto userLoginDto);

    //用户注册
    Boolean registerUser(UserRegisterDto userRegisterDto);

    //用户永久删除（慎用）
    Boolean deleteUser(UserDeleteDto userDeleteDto);
}
