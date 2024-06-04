package com.myapp.controller;

import com.myapp.bootstrap.DataGenerator;
import com.myapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public String register(Model model) {
        List<Student> students = DataGenerator.createStudents();
        model.addAttribute("students", students);
        return "student/register";
    }

    @RequestMapping(value ="/welcome", method = RequestMethod.POST)
    @PostMapping("/welcome")
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
