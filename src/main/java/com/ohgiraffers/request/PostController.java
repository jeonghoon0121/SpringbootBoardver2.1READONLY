package com.ohgiraffers.request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/post/*")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService){
        this.postService =postService;
    }

    @GetMapping("/list")
    public String findAllPosts(Model model){
        List<PostDTO> postDTOList = postService.findAllPosts();
        System.out.println("postDTOList = " + postDTOList);
        for(PostDTO posts : postDTOList){
            System.out.println("posts = " + posts);
        }
        System.out.println(postDTOList);
        model.addAttribute("postDTOList",postDTOList);
        return "post/list";
    }

}
