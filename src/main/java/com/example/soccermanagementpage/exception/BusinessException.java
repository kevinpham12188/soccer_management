package com.example.soccermanagementpage.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;
import java.text.MessageFormat;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;

    @Override
    public String getMessage() {
        return MessageFormat.format("{0}", message);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}", message);
    }
}
