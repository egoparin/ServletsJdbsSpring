package ru.oparin.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.oparin.service.models.User;
import ru.oparin.service.repositories.UsersRepository;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return usersRepository.findAll();
    }

    @GetMapping("users/{user-id}")
    public User getUser (@PathVariable("user-id") Long  userId){
        return usersRepository.findById(userId).get();
    }
}
