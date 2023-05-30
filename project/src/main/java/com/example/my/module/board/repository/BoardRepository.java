package com.example.my.module.board.repository;

import com.example.my.module.board.entity.BoardEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Repository
@Mapper
public interface BoardRepository {


    // 문의게시글 등록
    void insertBoard(HttpServletRequest req);


    // Board Total Count : 총 게시물 수
    /*Integer getBoardTotalCount(@Param("keyField") String keyField, @Param("keyWord") String keyWord);*/
//    Integer getBoardTotalCount();


    // 문의게시글 목록 조회
    /*List<BoardEntity> getBoardList(@Param("keyField") String keyField, @Param("keyWord") String keyWord, @Param("start") Integer start, @Param("cnt") Integer cnt);*/
    List<BoardEntity> getBoardList();



//    //게시글 조회수 증가
//    void incBoardViewCount(Integer idx);
//
//
//
//    // 선택한 게시글 내용 조회
//    BoardEntity getOneBoardContent(Integer idx);
//
//
//    //게시글 수정
//    void updateBord(BoardEntity boardEntity, Integer idx);
//
//
//
//    //게시글 삭제
//    void deleteBord(BoardEntity boardEntity, Integer idx);
//
//
//    //게시글 "첨부파일" 삭제
//    void deleteAttachFile(BoardEntity boardEntity, Integer idx);
//
//
//    // 게시판 작성자 ID확인
//    String getBoardWriterId(Integer idx);



}
