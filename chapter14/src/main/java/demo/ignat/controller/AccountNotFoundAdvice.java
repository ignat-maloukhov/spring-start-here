package demo.ignat.controller;

import demo.ignat.exception.AccountNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AccountNotFoundAdvice {

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<String> exceptionAccountNotFoundHandler() {
        return ResponseEntity
                .badRequest()
                .body("Account Not Found");
    }
}

