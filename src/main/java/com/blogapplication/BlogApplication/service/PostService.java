package com.blogapplication.BlogApplication.service;

import com.blogapplication.BlogApplication.entity.Post;
import com.blogapplication.BlogApplication.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto post);
}
