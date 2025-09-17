package com.ohgiraffers.request;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }


    public List<BoardDTO> findAllBoards() {
        System.out.println(boardMapper.findAllboards());
        return boardMapper.findAllboards();

    }

}
