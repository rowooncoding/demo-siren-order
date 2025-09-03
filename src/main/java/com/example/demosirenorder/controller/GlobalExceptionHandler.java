package com.example.demosirenorder.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public Response<Void> handlerRuntimeException(RuntimeException e) {
        return Response.fail(e.getMessage());
    }
}
