package com.transporeon.springmvc.restapi;

import com.transporeon.springmvc.model.Employee;
import com.transporeon.springmvc.model.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@RestController // @Controller + @ResponseBody
public class WelcomeRestController {

    public static Map<Integer, Integer> numbers = new HashMap<>();

    static {
        Random rnd = new Random();

        for (int i = 1; i <= 500; i++) {
            numbers.put(i, rnd.nextInt(-500, 500));
        }

    }

    @GetMapping("/number")
    public Map<Integer, Integer> getAllNumbers() {
        return numbers;
    }


    @GetMapping(value = "/number/odd", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public Map<Integer, Integer> getOnlyOddKeys(@RequestBody Employee emp) {
        Map<Integer, Integer> nums = new HashMap<>();
        for (int key : numbers.keySet()) {
            if (key % 2 != 0) {
                nums.put(key, numbers.get(key));
            }
        }
        return nums;
    }

}
