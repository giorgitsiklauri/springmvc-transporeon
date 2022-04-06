package com.transporeon.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomePageController {

    //handler methods a.k.a @Controller methods.
    //@GetMapping("/welcome") a bit newer version
    @RequestMapping(value = "/welcome")
    public String getHomePage() {
        return "welcome"; //whatever string value is returned from the handler method, is going to be a the view name view resolver will use to identify view template!
    }




    /*
    //handler methods a.k.a @Controller methods.
    //alternative of above with ModelAndView
    @RequestMapping("/anotherwelcome")
    public ModelAndView getHomePageAlternative(@RequestParam(value = "n", required = false) String name,
                              @RequestParam(value = "l", required = false) String surname,
                              @RequestParam(value = "a", required = false) Integer age,
                              Model model) {
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("name", name);
        mv.addObject("surname", surname);
        mv.addObject("age", age);

        return mv; //whatever string value is returned from the handler method, is going to be a the view name view resolver will use to identify view template!
    }
*/
}
