package com.blogapplication.BlogApplication.service.impl;

import com.blogapplication.BlogApplication.entity.Post;
import com.blogapplication.BlogApplication.exception.ResourceNotFoundException;
import com.blogapplication.BlogApplication.payload.PostDto;
import com.blogapplication.BlogApplication.repository.PostRepository;
import com.blogapplication.BlogApplication.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
@Override
    public List<PostDto> getAllPosts(int pageNo,int pageSize) {
    Pageable pageable= PageRequest.of(pageNo,pageSize);
        List<Post> posts=postRepository.findAll(pageable).getContent();
       return posts.stream().map(post->mapToDTO(post)).collect(Collectors.toList());




    }

    @Override
    public PostDto getPostById(Long id) {
        Post post=postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));
        PostDto postDto=mapToDTO(post);
        return postDto;
    }

    private PostDto mapToDTO(Post post){
        PostDto postDto=new PostDto();
        postDto.setId(post.getId());
        postDto.setDescription(post.getDescription());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        return postDto;


    }
    private Post mapToEntity(PostDto postDto){
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setTitle(post.getTitle());
        post.setContent(postDto.getContent());
        return post;
    }

}
