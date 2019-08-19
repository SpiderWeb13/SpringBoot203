package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model model) {
        model.addAttribute("song",new Song());
        return "singform";
    }
    @PostMapping("/songform")
    public String loadFromPage (@ModelAttribute song song, Moddel model) {
        model.addAttriibute("song", song);
        return "confirmsong";
    }
}
