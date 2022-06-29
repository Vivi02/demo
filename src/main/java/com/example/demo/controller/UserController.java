package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAllUser")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/insertUser")
    public void insert(@RequestBody User user){
        userService.insert(user);
    }

    @PutMapping("/updateUser")
    public void update(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/deleteUserById/{id}")
    public void deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
    }
}
