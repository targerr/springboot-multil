package com.wang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index() {
        return "Hello SpringBoot Model!";
    }
}
