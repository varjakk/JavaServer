package com.varjak.javaserver.controller;

import com.varjak.javaserver.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/helloUser")
    public String helloUser(@RequestBody User user){
        return "welcome " + user.getUsername() + " come to " + user.getAddress() + "!";
    }

}
