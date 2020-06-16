package com.example.demo.controller;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    DSLContext dslContext;

    @RequestMapping("/test")
    public String test(){
        return "hello bxz";
    }




}
