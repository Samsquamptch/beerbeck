package com.beerbeck.beerbeck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    @RequestMapping("/")
    public String getGreeting() {
        return "Test Test";
    }
}
