package com.classsystem.classsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.classsystem.classsystem.mbg.mapper")
@SpringBootApplication
public class ClasssystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClasssystemApplication.class, args);
    }

}
