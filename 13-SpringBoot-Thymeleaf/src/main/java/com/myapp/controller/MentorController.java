package com.myapp.controller;

import com.myapp.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("mentor", new Mentor());
        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3");
        model.addAttribute("batchList", batchList);
        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String confirm(@ModelAttribute ("mentor") Mentor mentor) {
        System.out.println(mentor);
//        return "mentor/mentor-confirm";
        return "redirect:/mentor/register";
    }
}
