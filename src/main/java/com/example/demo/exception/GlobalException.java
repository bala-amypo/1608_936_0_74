package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice;
public class GlobalException{

    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationException ex){
        return new ResponseBody<String>
    }
}