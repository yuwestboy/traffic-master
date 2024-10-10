 package com.everpower.traffic_web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class userController {

    private static final Logger logger = LoggerFactory.getLogger(userController.class);

    @GetMapping("/name")
    public String getName() {

        logger.error("test my logger");
        return "hello, world!";
    }

}
