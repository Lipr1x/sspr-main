package com.example.lab3_sspr;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Kirill";
    }

    @RequestMapping("/2")
    public String home2() {
        return "Ovsyannikov";
    }

    @RequestMapping("/3")
    public String home3() {
        return "lab3";
    }
}
