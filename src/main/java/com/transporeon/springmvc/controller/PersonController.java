package com.transporeon.springmvc.controller;

import com.transporeon.springmvc.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/profile") //class-level base mapping


// www.yourpage.com/person/path-variable
public class PersonController {

    private List<Person> personList = new ArrayList<>();


    //improved below
/*    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String getProfilePage(@RequestParam("firstname") String name,
                                 @RequestParam("lastname") String surname,
                                 @RequestParam("position") String pos,
                                 @RequestParam("age") Integer age,
                                 Model model) {

        personList.add(new Person(name, surname, age, pos));


        model.addAttribute("p", personList);

        return "profile";

    }*/


    //let's improve getProfilePage
    @PostMapping("/create")
    public String getProfilePage2(Person person, Model m) {
        personList.add(person);
        m.addAttribute("p", personList);
        return "profile";
    }

    @RequestMapping("/show")
    public String getProfilePage(HttpServletRequest request, Model model) {
        model.addAttribute("p", personList);
        return "profile";
    }

}
