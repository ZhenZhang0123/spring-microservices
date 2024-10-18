package com.zhenzhang0123.spring.springmicroservices.jpa;

import com.zhenzhang0123.spring.springmicroservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
