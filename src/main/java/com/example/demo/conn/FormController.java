package com.example.demo.conn;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class FormController {
	
	@GetMapping("/formeee")
    public String demoform(@ModelAttribute("user") User user, Model model){
       
        user.setName("");
        user.getSele();
        user.setMyColors(new String[]{"red","white", "black", "green",  "blue"});
        
        model.addAttribute("user", user);
        return "formeee";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute User user, Model model){
       
        model.addAttribute("dddddd", user);
        System.out.println("Full name:" + user.getName());
        System.out.println("Gender:" + user.getSele());
        System.out.println("Favorite colors:" + Arrays.toString(user.getMyColors()));
       
        return "submit";
    }

    
}
