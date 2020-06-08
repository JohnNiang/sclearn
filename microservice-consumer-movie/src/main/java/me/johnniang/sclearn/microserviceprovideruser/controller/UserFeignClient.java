package me.johnniang.sclearn.microserviceprovideruser.controller;

import me.johnniang.sclearn.microserviceprovideruser.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/api/v1/users/{userId}")
    User findById(@PathVariable("userId") Long userId);
}
