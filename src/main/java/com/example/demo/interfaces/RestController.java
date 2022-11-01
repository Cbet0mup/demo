package com.example.demo.interfaces;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final MyInterface myInterface;

    public RestController(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    @GetMapping("/")
    public String printResponse() {
        return myInterface.doSomthing();
    }
}
