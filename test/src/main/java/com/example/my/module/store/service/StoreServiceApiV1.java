package com.example.my.module.store.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.my.common.dto.ResDTO;
import com.example.my.config.security.CustomUserDetails;
// import com.example.my.config.security.CustomUserDetails;
import com.example.my.module.store.dto.StoreDTO;
import com.example.my.module.store.entity.StoreEntity;
import com.example.my.module.store.repository.StoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreServiceApiV1 {

    private final StoreRepository storeRepository;


        @Transactional
        public HttpEntity<?> productAll(CustomUserDetails customUserDetails) {

        // List<TodoEntity> todoEntityList = todoRepository.findByDeleteYn(deleteYn);

        // 로그인 한 유저가 쓴 할 일만 가져옴
        List<StoreEntity> storeEntityList = storeRepository.productAll();

        return new ResponseEntity<>(
                ResDTO.builder()
                        .code(0)
                        .message("할 일 조회에 성공하였습니다.")
                        // .data(TodoDTO.ResBasic.fromEntityList(todoEntityList))
                        .data(StoreDTO.ResBasic.fromUserEntityList(storeEntityList,customUserDetails.getMemberEntity()))
                        .build(),
                HttpStatus.OK);
        }

        @Transactional
        public HttpEntity<?> getCategory(){

                List<StoreEntity> categoryList = storeRepository.getCategory();
                return new ResponseEntity<>(
                ResDTO.builder()
                        .code(0)
                        .message("할 일 추가에 성공하였습니다.")
                        .data(StoreDTO.ResCategory.fromEntityList(categoryList))
                        .build(),
                HttpStatus.OK);
        }


        // @Transactional
        // public HttpEntity<?> insertProduct(StoreDTO.ReqBasic reqDto) {

        // // 본인이 적은 글임을 DB에 넣어준다
        // storeRepository.insertProduct(reqDto.toEntity());

        // return new ResponseEntity<>(
        //         ResDTO.builder()
        //                 .code(0)
        //                 .message("할 일 추가에 성공하였습니다.")
        //                 .build(),
        //         HttpStatus.OK);
        // }

        // @Transactional
        // public HttpEntity<?> modifyProduct(StoreDTO.ReqBasic reqDto) {

        // // 본인 글이 아닐 시 에러 발생
        // storeRepository.modifyProduct(reqDto.toEntity());

        // return new ResponseEntity<>(
        //         ResDTO.builder()
        //                 .code(0)
        //                 .build(),
        //         HttpStatus.OK);
        // }

        // @Transactional
        // public HttpEntity<?> deleteProduct(CustomUserDetails customUserDetails, Integer idx) {


        // storeRepository.deleteProduct(idx);

        // // 리턴값 수정
        // // 1번 할 일(잠자기) 삭제에 성공하였습니다.
        // return new ResponseEntity<>(
        //         ResDTO.builder()
        //                 .code(0)
        //                 .build(),
        //         HttpStatus.OK);
        // }

}
