package com.kobyzau.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("""
                                         {
                                         "status": "OK",
                                         "version": 2,
                                         }
                                         """);
    }
}
