package com.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    public String metodoLog(){

        LOG.info("This is an info message");
        LOG.warn("This is a warn message");
        LOG.error("This is an error message");

        return "TheLog";

    }


}
