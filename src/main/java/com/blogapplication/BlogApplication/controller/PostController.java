package com.blogapplication.BlogApplication.controller;


import com.blogapplication.BlogApplication.payload.PostDto;
import com.blogapplication.BlogApplication.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/shiva")
public class PostController {
    @Autowired
    private PostServiceImpl postService;
    @PostMapping("/createpost")
public ResponseEntity<PostDto> createPost(@RequestBody PostDto postdto){
    return new ResponseEntity<>(postService.createPost(postdto), HttpStatus.OK);
}

}
