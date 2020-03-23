package com.classsystem.classsystem.controller;


import com.classsystem.classsystem.domain.dto.ManagementUpdateUserDto;
import com.classsystem.classsystem.domain.vo.ManagementGetUserVo;
import com.classsystem.classsystem.service.ManagementService;
import com.classsystem.classsystem.utils.response.Response;
import com.classsystem.classsystem.utils.response.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WZY
 * @create 2020/3/23
 */
@RestController
@RequestMapping("/management")
public class ManagementController {

    @Autowired
    private ManagementService managementService;

    @GetMapping("/get")
    public List<ManagementGetUserVo> getAllUser(){
        return managementService.getAllUser();
    }

    @PostMapping("/update")
    private ResponseEntity updateUser(ManagementUpdateUserDto managementUpdateUserDto){
        if(managementService.updateUser(managementUpdateUserDto)){
            return new ResponseEntity(Response.SUCCESS, Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }

}
