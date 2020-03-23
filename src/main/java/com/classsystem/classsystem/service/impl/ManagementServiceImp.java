package com.classsystem.classsystem.service.impl;

import com.classsystem.classsystem.domain.dto.ManagementUpdateUserDto;
import com.classsystem.classsystem.domain.vo.ManagementGetUserVo;
import com.classsystem.classsystem.mbg.mapper.UserDao;
import com.classsystem.classsystem.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WZY
 * @create 2020/3/23
 */
@Service
public class ManagementServiceImp implements ManagementService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<ManagementGetUserVo> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public boolean updateUser(ManagementUpdateUserDto managementUpdateUserDto) {
        return userDao.updateUser(managementUpdateUserDto);
    }
}
