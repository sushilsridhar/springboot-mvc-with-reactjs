package com.springbootmvcwithreactjs.controller;

import com.springbootmvcwithreactjs.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                   BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("contains error");
            return "registration";
        }

        System.out.println("post " + registration.getName());
        return "redirect:registration";
        /* after post, redirects by making a get request to registration, loading
        fresh registration page */
    }
}
