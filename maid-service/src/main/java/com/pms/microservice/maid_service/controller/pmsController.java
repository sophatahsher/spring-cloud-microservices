package com.pms.microservice.maid_service.controller;

import com.pms.microservice.maid_service.bean.pms;
import com.pms.microservice.maid_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pmsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public pms retrievePms() {
        return new pms(configuration.getMinimum(), configuration.getMaximum());
        // return new pms(1, 1000);
    }
}
