package com.blogapplication.BlogApplication.repository;

import com.blogapplication.BlogApplication.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
