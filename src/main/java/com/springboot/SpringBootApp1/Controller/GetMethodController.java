package com.springboot.SpringBootApp1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
//@Controller
//@GetMapping
@RestController
public class GetMethodController {

    @GetMapping("naruto")
    public String naruto(){
        return "My ninja Way";
    }
}
