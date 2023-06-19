package com.example.soccermanagementpage.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class EntityNotFoundException extends RuntimeException {
    private int code;
    private String message;

    public EntityNotFoundException(){
//        super();
    }

    public EntityNotFoundException(int code,String message){
//        super();
        this.code = code;
        this.message = message;
    }
}
