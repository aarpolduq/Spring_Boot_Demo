package com.aarpolduq.springboot.demo.demo.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose "/" that returns "Hello World!"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
         return "Run 5km!";
    }

    @GetMapping("/mickey")
    public String getMickey() {
        return "Hello "+coachName+" from "+ teamName;
    }
}
