package com.example.clientapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class TestController {

    @GetMapping("/name")
    public String test() {
        return "379487593475938457389457938475938475938475938475";
    }
}
