package com.classsystem.classsystem.utils.exception;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class NoUserException extends Exception {
    public NoUserException() {
        super("对不起，请登录");
    }

    @ResponseBody
    @ExceptionHandler(NoUserException.class)
    public JSONObject handleException(Exception e) {
        //return JSONUtils.fail(e);
        return null;
    }
}
