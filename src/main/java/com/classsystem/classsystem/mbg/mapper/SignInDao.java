package com.classsystem.classsystem.mbg.mapper;

import com.classsystem.classsystem.domain.dto.SignInDto;
import org.springframework.stereotype.Repository;

/**
 * @author WZY
 * @create 2020/3/22
 */
@Repository
public interface SignInDao {

    Boolean signInStudent(SignInDto signInDto);
}
