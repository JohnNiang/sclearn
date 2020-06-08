package me.johnniang.sclearn.microserviceprovideruser.controller;

import me.johnniang.sclearn.microserviceprovideruser.dao.UserRepository;
import me.johnniang.sclearn.microserviceprovideruser.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("{userId:\\d+}")
    public Optional<User> findById(@PathVariable("userId") Long userId) {
        return userRepository.findById(userId);
    }
}
