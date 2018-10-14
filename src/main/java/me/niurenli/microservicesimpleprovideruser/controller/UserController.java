package me.niurenli.microservicesimpleprovideruser.controller;

import me.niurenli.microservicesimpleprovideruser.dao.UserRepository;
import me.niurenli.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Optional optional = userRepository.findById(id);
        if (optional.isPresent()) {
            return (User) optional.get();
        }
        return null;
    }
}
