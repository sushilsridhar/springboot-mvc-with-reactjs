package com.springbootmvcwithreactjs.controller;

import com.springbootmvcwithreactjs.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "James") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Bond") String lastName,
                        @RequestParam(value = "age", defaultValue = "30") int age) {

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {

        System.out.println("First name: "+ user.getFirstName()+ "last name: "+ user.getLastName()
                + "age: " + user.getAge());

        return user;
    }
}
