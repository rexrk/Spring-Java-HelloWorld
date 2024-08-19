package com.rexrk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/helloSpring")
    public String helloSpring(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("<h1> Hello %s ! </h1>", name);
    }
    @GetMapping("/")
    public String Hello(){
        return "Hello";
    }
    // System.out.println("hello");

}
