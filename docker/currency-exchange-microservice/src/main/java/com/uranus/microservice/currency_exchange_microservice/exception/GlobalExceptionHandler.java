package com.uranus.microservice.currency_exchange_microservice.exception;

import com.uranus.microservice.currency_exchange_microservice.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CurrencyExchangeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCurrencyExchangeNotFound(
            CurrencyExchangeNotFoundException ex) {

        return new ErrorResponse(
                LocalDateTime.now(),
                404,
                "Not Found",
                ex.getMessage()
        );
    }
}
