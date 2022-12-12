package com.swaggerEsercizio02.swaggerEsercizio02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping("")
    public String sayHello() {
        return "Benvenuto nel localhost 5050";
    }
}
