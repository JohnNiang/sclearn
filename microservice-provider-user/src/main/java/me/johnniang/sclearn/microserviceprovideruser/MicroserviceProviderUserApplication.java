package me.johnniang.sclearn.microserviceprovideruser;

import me.johnniang.sclearn.microserviceprovideruser.dao.UserRepository;
import me.johnniang.sclearn.microserviceprovideruser.entity.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class MicroserviceProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserApplication.class, args);
    }

    @Bean
    ApplicationRunner initUser(UserRepository userRepository) {
        return args -> {
            User user1 = new User(1L, "user1", "john1", 1, BigDecimal.TEN);
            User user2 = new User(2L, "user2", "john2", 1, BigDecimal.TEN);
            User user3 = new User(3L, "user3", "john3", 1, BigDecimal.TEN);
            Stream.of(user1, user2, user3).forEach(userRepository::save);
        };
    }
}
