package me.johnniang.sclearn.microserviceprovideruser.controller;

import me.johnniang.sclearn.microserviceprovideruser.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/movies")
public class UserController {
    private final UserFeignClient userFeignClient;

    public UserController(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @GetMapping("users/{userId:\\d+}")
    public User findById(@PathVariable("userId") Long userId) {
        return userFeignClient.findById(userId);
    }
}
