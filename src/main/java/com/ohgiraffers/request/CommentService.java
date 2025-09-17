package com.ohgiraffers.request;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentMapper commentMapper;

    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }
    public List<CommentDTO> findAllComments() {
        System.out.println(commentMapper.findAllComments());
        return commentMapper.findAllComments();
    }

}
