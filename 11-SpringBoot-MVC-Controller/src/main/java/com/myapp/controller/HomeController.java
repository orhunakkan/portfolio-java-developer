package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String methodHome() {
        return "home.html";
    }

    @RequestMapping("/")
    public String defaultHome() {
        return "home.html";
    }

    @RequestMapping({"/index", "/login"})
    public String home2() {
        return "home.html";
    }

    @RequestMapping("/student2")
    public String getStudentInfo() {
        return "student/welcome.html";
    }
}
