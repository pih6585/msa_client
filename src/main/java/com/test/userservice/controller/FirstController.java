package com.test.userservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/first-service")
public class FirstController {

    Logger log = LoggerFactory.getLogger(FirstController.class);

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to First Service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info(header);
        return "Hello world in FirstSerice";
    }
}
