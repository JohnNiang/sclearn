package me.johnniang.sclearn.microserviceprovideruser.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import me.johnniang.sclearn.microserviceprovideruser.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/movies")
public class UserController {
    private final UserFeignClient userFeignClient;

    public UserController(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping("users/{userId:\\d+}")
    public User findById(@PathVariable("userId") Long userId) {
        return userFeignClient.findById(userId);
    }

    public User findByIdFallback(Long userId) {
        return new User(userId, "your_name", "Your name", 0, BigDecimal.ZERO);
    }
}
