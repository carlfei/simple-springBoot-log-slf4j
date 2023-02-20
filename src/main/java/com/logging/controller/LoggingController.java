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

        LOG.info("my info log");
        LOG.warn("my warn log");
        LOG.error("my error log");

        return "TheLog";

    }


}
