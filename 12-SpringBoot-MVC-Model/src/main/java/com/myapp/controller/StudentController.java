package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String welcomePage(Model model) {
        model.addAttribute("name", "Mike");
        model.addAttribute("course", "MVC");
        return "student/welcome";
    }
}
