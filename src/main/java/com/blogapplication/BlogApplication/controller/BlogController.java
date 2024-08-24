package com.blogapplication.BlogApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/tocheck")
    public String tocheck(){
        return "success";
    }

}
