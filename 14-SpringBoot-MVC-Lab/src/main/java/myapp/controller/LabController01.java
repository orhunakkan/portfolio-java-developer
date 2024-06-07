package myapp.controller;

import myapp.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;

@Controller
public class LabController01 {

    @GetMapping("/lab")
    public String lab(Model model) {
        model.addAttribute("firstLab", "lab-01-Coupling");
        model.addAttribute("secondLab", "lab-04-IoC");
        model.addAttribute("thirdLab", "lab-03-DI");
        model.addAttribute("fourthLab", "lab-04-Spring Boot");
        model.addAttribute("fifthLab", "lab-05-Spring MVC");
        return "lab/lab-list";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        Profile profile = new Profile();
        profile.setName("John");
        profile.setSurname("Doe");
        profile.setUserName("johnDoe");
        profile.setPhoneNumber("1234567890");
        profile.setCreatedDate(LocalDateTime.now());
        profile.setEmail("john@doe.com");
        model.addAttribute("profile", profile);
        return "profile/profile-info";
    }

    @GetMapping("/login/{email}/{phoneNumber}")
    public String login(Model model, @PathVariable String email, @PathVariable String phoneNumber) {
        model.addAttribute("loginMessage", "Login Successful");
        return "login/login-info";
    }
}
