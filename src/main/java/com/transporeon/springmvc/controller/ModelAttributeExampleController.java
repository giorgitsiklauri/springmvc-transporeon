package com.transporeon.springmvc.controller;

import com.transporeon.springmvc.model.Person;
import com.transporeon.springmvc.restapi.WelcomeRestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ma-example") //ma stands for model attribute
public class ModelAttributeExampleController {


    @GetMapping("")
    public String getWelcomePage() {
        return "welcome";
    }


    @PostMapping
    public String save(@ModelAttribute("prs") Person p) {
        return "maprofile";
    }

    @GetMapping("/first")
    public String firstPage(Model model) {
        model.addAttribute("data", WelcomeRestController.numbers.keySet());
        /*
         * big big long logic here..
         *
         * */
        return "first";
    }

    @GetMapping("/second")
    public String secondPage(Model model) {
        model.addAttribute("data", WelcomeRestController.numbers.values());
        /*
        * big big long logic here..
        *
        * */
        return "second";
    }

    @GetMapping("/third")
    public String thirdPage(Model model) {
        model.addAttribute("data", WelcomeRestController.numbers);
        /*
         * big big long logic here..
         *
         * */
        return "third";
    }


    @ModelAttribute("footer")
    public String sharedData() {
        return "This is the footer of page. Copyright 2022";
    }


}
