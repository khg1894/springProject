package com.example.teamproject.module.board.controller;


import com.example.teamproject.module.board.entity.BoardEntity;
import com.example.teamproject.module.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boardList")
    public String boardList(Model model) {


        model.addAttribute("boardDto", boardService.getBoardList());

        return "boardList_test";
    }

}
