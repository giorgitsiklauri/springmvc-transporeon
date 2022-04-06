package com.transporeon.springmvc.controller;

import com.transporeon.springmvc.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/profile") //class-level base mapping
public class PersonController {

    private List<Person> personList = new ArrayList<>();


    //let's improve getProfilePage
    @PostMapping("/create")
    public String getProfilePage2(Person person, Model m) {
        personList.add(person);
        m.addAttribute("p", personList);
        return "profile";
    }

    @RequestMapping("/show")
    public String getProfilePage(Model model) {
        model.addAttribute("p", personList);
        return "profile";
    }


    //This method maps to host/profile/{age}
    @GetMapping("{age}")
    public String getProfilesLessThanAge(@PathVariable("age") int age, Model model) {
        List<Person> plist = personList
                .stream()
                .filter(p -> p.getAge() < age)
                .collect(Collectors.toList());

        //there can be much more logic..

        model.addAttribute("p", plist);
        return "profile";
    }

}
