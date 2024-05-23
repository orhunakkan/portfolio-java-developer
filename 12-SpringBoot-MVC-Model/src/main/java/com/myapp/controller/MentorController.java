package com.myapp.controller;

import com.myapp.model.Gender;
import com.myapp.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String mentorTable(Model model) {

//        Mentor mentor01 = new Mentor(45, "Mike", "Smith", Gender.MALE);
//        Mentor mentor02 = new Mentor(65, "Tom", "Hanks", Gender.MALE);
//        Mentor mentor03 = new Mentor(425, "Amy", "Bryan", Gender.FEMALE);
//
//        model.addAttribute("mentor01", mentor01);
//        model.addAttribute("mentor02", mentor02);
//        model.addAttribute("mentor03", mentor03);

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor(45, "Mike", "Smith", Gender.MALE));
        mentorList.add(new Mentor(65, "Tom", "Hanks", Gender.MALE));
        mentorList.add(new Mentor(425, "Amy", "Bryan", Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "/mentor/mentorList";
    }

}
