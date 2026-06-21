package com.uranus.microservice.currency_exchange_microservice.exception;

public class CurrencyExchangeNotFoundException extends RuntimeException {

    public CurrencyExchangeNotFoundException(String from, String to) {
        super("Unable to find exchange rate from " + from + " to " + to);
    }
}