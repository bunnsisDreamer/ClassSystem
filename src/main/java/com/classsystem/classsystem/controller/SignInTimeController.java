package com.classsystem.classsystem.controller;

import com.classsystem.classsystem.domain.dto.SignInDto;
import com.classsystem.classsystem.service.SignInService;
import com.classsystem.classsystem.utils.response.Response;
import com.classsystem.classsystem.utils.response.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author WZY
 * @create 2020/3/22
 */
@RestController
@RequestMapping("/signIn")
public class SignInTimeController {

    @Autowired
    private SignInService signInService;

    @PostMapping("/signIn")
    public ResponseEntity signInStudent(@RequestBody SignInDto signInDto){
        if(signInService.SignInStudent(signInDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }
}
