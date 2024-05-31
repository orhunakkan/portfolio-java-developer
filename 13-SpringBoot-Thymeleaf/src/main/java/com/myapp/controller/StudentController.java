package com.myapp.controller;

import com.myapp.bootstrap.DataGenerator;
import com.myapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String register(Model model) {
        List<Student> students = DataGenerator.createStudents();
        model.addAttribute("students", students);
        return "student/register";
    }

    @RequestMapping("/welcome")
    public String welcomePage(Model model) {
        return "student/welcome";
    }

}
