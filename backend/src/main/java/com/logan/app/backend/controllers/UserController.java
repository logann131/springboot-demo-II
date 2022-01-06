package com.logan.app.backend.controllers;

import java.util.List;

import com.logan.app.backend.models.UserModel;
import com.logan.app.backend.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Restful API
@RequestMapping("/api") // /api endpoint 
public class UserController {
    @Autowired //connects repository with private variables
    private UserRepository userRepository;
    

    // @route: GET /api
    // @desc: get all users
    // @access: PUBLIC 
    @GetMapping("/") 
    public List<UserModel> name() {
        return userRepository.findAll();
    }

    // @route: GET /api/{id}
    // @desc: get specific user
    // @access: PUBLIC // PathVariable represent {id} in the url
    @GetMapping("/{id}")
    public UserModel GetUser(@PathVariable Integer id) { // PathVariable annotation represents {id} in the url
        return userRepository.findById(id).orElse(null);
    }

    // @route: POST /api/
    // @desc: save/create new user into the repository
    // @access: PUBLIC 
    @PostMapping("/")
    public UserModel PostUser(@RequestBody UserModel user) {// RequestBody annotation request data from req.body
        return userRepository.save(user);
    }

    // @route: PUT /api
    // @desc: update user
    // @access: PUBLIC 
    @PutMapping("/")
    public UserModel PutUser(@RequestBody UserModel user) {
        UserModel oldUser = userRepository.findById(user.getId()).orElse(null);
        oldUser.setName(user.getName());
        oldUser.setEmail(user.getEmail());
        oldUser.setPassword(user.getPassword());
        return userRepository.save(oldUser);
    }

    // @route: DELETE /api
    // @desc: delete user
    // @access: PUBLIC 
    @DeleteMapping("/{id}")
    public Integer DeleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
        return id;
    }
    
}
