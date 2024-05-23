package com.myapp.controller;

import com.myapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String welcomePage(Model model) {

        model.addAttribute("name", "Mike");
        model.addAttribute("course", "MVC");

        String studentName = "John Doe";
        model.addAttribute("studentName", studentName);

        int studentId = new Random().nextInt();
        model.addAttribute("studentId", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        model.addAttribute("numbers", numbers);

        Student student01 = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student01);

        return "student/welcome";
    }
}
