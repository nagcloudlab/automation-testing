package org.example.web;

import org.example.service.AccountBalanceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiControllerAdvice {
    @ExceptionHandler(value = { AccountBalanceException.class })
    public HttpErrorInfo handleBalanceException(Throwable t) {
        HttpErrorInfo httpErrorInfo=new HttpErrorInfo(t.getMessage());
        return  httpErrorInfo;
    }
}
