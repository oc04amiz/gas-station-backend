package de.arnold.gasstationbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
