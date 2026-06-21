package com.uranus.microservice.currency_exchange_microservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
//    @Retry(name="sample-api", fallbackMethod = "hardcodedResponse")
    @CircuitBreaker(name="default", fallbackMethod = "hardcodedResponse")
    public String sampleApi() {
        logger.info("Sample API call received");

        ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", String.class);
        return responseEntity.getBody();
    }

    /**
     * This is a function fallback when it has been called by others methods
     * @param ex
     * @return
     */
    public String hardcodedResponse(Exception ex) {
        return "fallback Response.";
    }
}
