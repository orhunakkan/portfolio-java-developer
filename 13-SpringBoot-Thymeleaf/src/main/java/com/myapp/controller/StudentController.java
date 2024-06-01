package com.myapp.controller;

import com.myapp.bootstrap.DataGenerator;
import com.myapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String welcomePage(@RequestParam String name) {
        System.out.println(name);
        return "student/welcome";
    }

    @RequestMapping("/student-list")
    public String studentTable(Model model) {
        List<Student> students = DataGenerator.createStudents();
        model.addAttribute("students", students);
        return "student/student-list";
    }

}
