package com.classsystem.classsystem.mbg.mapper;

import com.classsystem.classsystem.domain.dto.ManagementUpdateUserDto;
import com.classsystem.classsystem.domain.dto.UserDeleteDto;
import com.classsystem.classsystem.domain.dto.UserLoginDto;
import com.classsystem.classsystem.domain.dto.UserRegisterDto;
import com.classsystem.classsystem.domain.po.UserPo;
import com.classsystem.classsystem.domain.vo.ManagementGetUserVo;
import com.classsystem.classsystem.domain.vo.UserLoginVo;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author WZY
 * @create 2020/3/18
 */

@Repository
public interface UserDao {

    UserPo findUserByUserName(String username);

    boolean registerUser(UserRegisterDto userRegisterDto);

    boolean deleteUser(UserDeleteDto userDeleteDto);

    List<ManagementGetUserVo> getAllUser();

    boolean updateUser(ManagementUpdateUserDto managementUpdateUserDto);
}
