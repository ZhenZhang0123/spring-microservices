package com.zhenzhang0123.spring.springmicroservices.jpa;

import com.zhenzhang0123.spring.springmicroservices.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
