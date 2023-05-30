package com.example.my.module.board.service;


import com.example.my.module.board.repository.BoardRepository;
import com.example.my.module.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardRepository boardRepository;


    /*public List<BoardEntity> getBoardList22(String keyField, String keyWord, Integer start, Integer cnt){
        return boardRepository.getBoardList(keyField, keyWord, start, cnt);
    }
*/
    public BoardDTO.ResBasic getBoardList(){
        return BoardDTO.ResBasic.fromEntityList(boardRepository.getBoardList());
    }

}
