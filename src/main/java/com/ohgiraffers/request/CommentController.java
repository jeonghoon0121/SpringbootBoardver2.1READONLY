package com.ohgiraffers.request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/comment/*")
public class CommentController {
    private final CommentService commentService;
    public CommentController(CommentService commentService){
        this.commentService =commentService;
    }
    @GetMapping("/list")
    public String findCommentList(Model model){
        List<CommentDTO> commentDTOList = commentService.findAllComments();
        System.out.println("commentDTOList = " + commentDTOList);
        for(CommentDTO comments : commentDTOList){
            System.out.println("comments = " + comments);
        }
        System.out.println(commentDTOList);
        model.addAttribute("commentDTOList",commentDTOList);
        return "comment/list";
    }

}
