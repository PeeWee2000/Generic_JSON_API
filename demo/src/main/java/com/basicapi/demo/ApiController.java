package com.basicapi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/data")
    public Map<String, String> data() {
        Map<String, String> json = new HashMap<>();
        json.put("message", "This is static JSON data.");
        return json;
    }
}