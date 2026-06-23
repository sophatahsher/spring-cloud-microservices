package com.uranus.microservice.currency_exchange_microservice;

import com.uranus.microservice.currency_exchange_microservice.exception.CurrencyExchangeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

    @Autowired
    private CurrencyExchangeRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange handleCurrencyExchange(@PathVariable String from, @PathVariable String to) {

        // INFO [currency-exchange-microservice,7e0cab3c103f84f73d7f22396a467748,e4f88d820b2f0ac2] 179627 --- [currency-exchange-microservice] [nio-8000-exec-1] [7e0cab3c103f84f73d7f22396a467748-e4f88d820b2f0ac2] c.u.m.c.CurrencyExchangeController       : handleCurrencyExchange called with USD to IND
        logger.info("handleCurrencyExchange called with {} to {}", from, to);

        // Return data mockup
        // CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));

        // Return data from H2 Database
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);

        if (currencyExchange == null) {
            throw new CurrencyExchangeNotFoundException(from, to);
        }

        // Get and Set default Environment
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);

        return currencyExchange;
    }
}
