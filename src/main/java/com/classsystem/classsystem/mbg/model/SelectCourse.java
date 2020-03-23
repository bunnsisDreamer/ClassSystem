package com.classsystem.classsystem.mbg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WZY
 * @create 2020/3/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectCourse {
    private int id;
    private int userId;
    private int courseId;

}
