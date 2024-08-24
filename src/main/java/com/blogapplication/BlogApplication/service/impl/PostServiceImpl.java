package com.blogapplication.BlogApplication.service.impl;

import com.blogapplication.BlogApplication.entity.Post;
import com.blogapplication.BlogApplication.payload.PostDto;
import com.blogapplication.BlogApplication.repository.PostRepository;
import com.blogapplication.BlogApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {



    @Autowired
    PostRepository postRepository;
    @Override
    public PostDto createPost(PostDto postdto) {
        Post post=new Post();
        post.setTitle(postdto.getTitle());
        post.setContent(postdto.getContent());
        post.setDescription(postdto.getDescription());

        Post newpost=postRepository.save(post);

        PostDto newpostdto=new PostDto();
        newpostdto.setContent(newpost.getContent());
        newpostdto.setTitle(newpost.getTitle());
        newpostdto.setDescription(newpost.getDescription());
        newpostdto.setId(newpost.getId());

        return newpostdto;
    }
}
