package com.blogapplication.BlogApplication.service;

import com.blogapplication.BlogApplication.entity.Post;
import com.blogapplication.BlogApplication.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto post);
    List<PostDto> getAllPosts(int pageNo,int pagesize);

    PostDto getPostById(Long id);
}
