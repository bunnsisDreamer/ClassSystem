package com.classsystem.classsystem.domain.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author WZY
 * @create 2020/3/18
 */
@Data
@ToString
public class UserLoginDto {
    private String username;
    private String password;
}
