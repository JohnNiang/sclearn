package me.johnniang.sclearn.microserviceprovideruser.dao;

import me.johnniang.sclearn.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
