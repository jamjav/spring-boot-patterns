package com.patterns.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/pattern")
public class PatternController {

    public PatternController() {

    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getPost(@PathVariable String id) {
        return "OK";

    }

}
