package com.classsystem.classsystem.utils.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author WZY
 * @create 2020/3/20
 */
@Data
@NoArgsConstructor
@ApiModel
@Slf4j
public class ResponseEntity {

    @ApiModelProperty("错误状态码") private int status;
    @ApiModelProperty("提示信息") private String msg;

    public ResponseEntity(int status, String msg){
        this.status = status;
        this.msg = msg;
        log.error(status + msg);
    }

}
