package com.classsystem.classsystem.controller;

import com.classsystem.classsystem.domain.dto.UserDeleteDto;
import com.classsystem.classsystem.domain.dto.UserRegisterDto;
import com.classsystem.classsystem.domain.dto.UserLoginDto;
import com.classsystem.classsystem.domain.vo.UserLoginVo;
import com.classsystem.classsystem.service.UserService;
import com.classsystem.classsystem.utils.response.Response;
import com.classsystem.classsystem.utils.response.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author WZY
 * @create 2020/3/18
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserLoginVo loginUser(@RequestBody UserLoginDto userLoginDto) {
        UserLoginVo userLoginVo = new UserLoginVo();
        if (userService.loginUser(userLoginDto).getPassword().equals(userLoginDto.getPassword())) {
            userLoginVo.setCode(200);
            userLoginVo.setUserId(userService.loginUser(userLoginDto).getId());
            userLoginVo.setType(userService.loginUser(userLoginDto).getType());
            userLoginVo.setMassage("ok");
        } else {
            userLoginVo.setCode(401);
            userLoginVo.setUserId(0);
            userLoginVo.setMassage("error");
        }
        return userLoginVo;
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody UserRegisterDto userRegisterDto) {
        if(userService.registerUser(userRegisterDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }
    }

    @PostMapping("/delete")
    public ResponseEntity deleteUser(@RequestBody UserDeleteDto userDeleteDto){
        if(userService.deleteUser(userDeleteDto)){
            return new ResponseEntity(Response.SUCCESS,Response.SUCCESSFUL);
        }
        else {
            return new ResponseEntity(Response.FAIL,Response.FAILURE);
        }

    }


    @GetMapping("/hello")
    public String say(){
        return "欢迎光临";
    }

}
