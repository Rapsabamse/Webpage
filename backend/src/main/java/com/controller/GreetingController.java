package com.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.model.Greeting;
import com.model.ServiceResponse;


/**
 * Class responsible for REST api to answer other services
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/upload")
    public ServiceResponse uploadCards(@RequestBody String cards) {
        return new ServiceResponse(cards, HttpStatusCode.valueOf(200));
    }
}
