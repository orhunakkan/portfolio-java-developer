package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

    @RequestMapping("/s")
    public String getProduct(@RequestParam(value = "k") String productName, Model model) {
        model.addAttribute("product", productName);
        return "product/product-info";
    }

}
