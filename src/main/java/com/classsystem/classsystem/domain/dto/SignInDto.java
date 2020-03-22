package com.classsystem.classsystem.domain.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author WZY
 * @create 2020/3/22
 */
@ToString
@Data
public class SignInDto {
    private int userId;
    private int courseId;
    private Date signInTime;
}
