package com.gentech.springboot_dockerdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Democontroller {

    @GetMapping("/welcomes")
    public static String displayDemo()
    {
        return "Hi Every one!! please welcome to our Spring boot Learning!!!";
    }
}
