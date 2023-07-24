package demo.ignat.controller;

import demo.ignat.exception.IllegalAmountException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class IllegalAmountAdvice {

    @ExceptionHandler(IllegalAmountException.class)
    public ResponseEntity<String> exceptionIllegalAmountHandler() {
        return ResponseEntity
                .badRequest()
                .body("Illegal Amount");
    }

}

