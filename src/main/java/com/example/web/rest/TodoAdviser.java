package com.example.web.rest;

import com.example.service.TodoBusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/14/17.
 */
@ControllerAdvice
public class TodoAdviser {

    @ExceptionHandler(TodoBusinessException.class)
    ResponseEntity<?> ifNotFound() {
        return ResponseEntity.notFound().build();
    }
}
