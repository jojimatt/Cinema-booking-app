package com.jojimatt.cinemabooking.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Tester {
    @GetMapping(path="/public")
    public String test(){
        return "Test successful.Welcome to the first steps";
    }
}
