package com.classsystem.classsystem.service;

import com.classsystem.classsystem.domain.dto.ManagementUpdateUserDto;
import com.classsystem.classsystem.domain.vo.ManagementGetUserVo;

import java.util.List;

/**
 * @author WZY
 * @create 2020/3/23
 */
public interface ManagementService {

    //获得所有成员
    List<ManagementGetUserVo> getAllUser();

    //修改某个成员
    boolean updateUser(ManagementUpdateUserDto managementUpdateUserDto);
}
