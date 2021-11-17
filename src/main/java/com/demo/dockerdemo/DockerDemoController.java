package com.demo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
    @GetMapping("/hello")
    public String hello() {
        return "Docker Demo - Sample Api";
    }

    @GetMapping("/api")
    public String api() {
        return "Spring Boot Rest API";
    }

    @GetMapping("/name")
    public String name() {
        return "Spring Boot Rest API";
    }

    @GetMapping("/qas")
    public String qas() {
        return "Return all qes";
    }

    @GetMapping("/good")
    public String good() {
        return "Return very nicw";
    }


}
