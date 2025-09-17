package com.ohgiraffers.request;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;
    public BoardController(BoardService boardService){
        this.boardService =boardService;
    }

    @GetMapping("/list")
    public String findBoardList(Model model){
        List<BoardDTO> boardDTOList = boardService.findAllBoards();
        System.out.println("boardDTOList = " + boardDTOList);
        for(BoardDTO boards : boardDTOList){
            System.out.println("boards = " + boards);
        }
        System.out.println(boardDTOList);
        model.addAttribute("boardDTOList",boardDTOList);
        return "board/list";
    }

}
