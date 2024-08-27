package com.blogapplication.BlogApplication.repository;

import com.blogapplication.BlogApplication.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
