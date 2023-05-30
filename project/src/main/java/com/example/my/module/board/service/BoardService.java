package com.example.teamproject.module.board.service;


import com.example.teamproject.module.board.dto.BoardDTO;
import com.example.teamproject.module.board.entity.BoardEntity;
import com.example.teamproject.module.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardRepository boardRepository;


    public List<BoardEntity> getBoardList22(String keyField, String keyWord, Integer start, Integer cnt){
        return boardRepository.getBoardList(keyField, keyWord, start, cnt);
    }

    public BoardDTO.ResBasic getBoardList(){
        return BoardDTO.ResBasic.fromEntityList(boardRepository.getBoardList());
    }

}
