package com.brasilsoftware.gerenciador_de_tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

    @GetMapping
    public String helloword(){
        return "Hello World!";
    }
}
