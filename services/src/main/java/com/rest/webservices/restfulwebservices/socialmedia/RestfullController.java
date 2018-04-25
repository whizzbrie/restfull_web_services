package com.rest.webservices.restfulwebservices.socialmedia;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfullController {
    @GetMapping(path = "/hello-world")
    public String hello(){
        return "Hello Brian Bahati";
    }
}
