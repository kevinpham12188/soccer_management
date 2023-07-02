package com.example.soccermanagementpage.handler;

import com.example.soccermanagementpage.exception.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity<Object> exception(BusinessException businessException) {
        return ResponseEntity.internalServerError().body(businessException.getMessage());
    }
}
