package com.blogapplication.BlogApplication.controller;


import com.blogapplication.BlogApplication.payload.PostDto;
import com.blogapplication.BlogApplication.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/shiva")
public class PostController {
    @Autowired
    private PostServiceImpl postService;
    @PostMapping("/createpost")
public ResponseEntity<PostDto> createPost(@RequestBody PostDto postdto){
    return new ResponseEntity<>(postService.createPost(postdto), HttpStatus.OK);
}
@GetMapping("/allposts")
    public ResponseEntity<List<PostDto>> getallposts(@RequestParam(value="pageNo",defaultValue = "0")int pageNo,@RequestParam(value="pageSize") int pageSize){

        return new ResponseEntity<>(postService.getAllPosts(pageNo,pageSize),HttpStatus.OK);
}
@GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name="id") Long id){
        return new ResponseEntity<>(postService.getPostById(id),HttpStatus.OK);

}

}
