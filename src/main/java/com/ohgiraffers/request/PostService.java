package com.ohgiraffers.request;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostMapper postMapper;
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }
    public List<PostDTO> findAllPosts() {
        System.out.println(postMapper.findAllPosts());
        return postMapper.findAllPosts();

    }

}
