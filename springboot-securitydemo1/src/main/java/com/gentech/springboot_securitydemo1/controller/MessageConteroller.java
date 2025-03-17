package com.gentech.springboot_securitydemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageConteroller {

    @GetMapping("/welcome")
    public String sayWelcome()
    {
        return "Hi Every one!! please welcome to our Spring boot Learning!!!";
    }
}
