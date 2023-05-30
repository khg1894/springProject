package com.example.my.module.member.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.my.common.dto.ResDTO;
import com.example.my.common.exception.BadRequestException;
import com.example.my.module.member.dto.MemberDTO;
import com.example.my.module.member.entity.MemberEntity;
import com.example.my.module.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberServiceApiV1 {

        private final MemberRepository memberRepository;
        private final PasswordEncoder passwordEncoder;

        @Transactional
        public HttpEntity<?> getMemberAll() {

        // List<TodoEntity> todoEntityList = todoRepository.findByDeleteYn(deleteYn);

        // 로그인 한 유저가 쓴 할 일만 가져옴
        List<MemberEntity> MemberEntityList = memberRepository.getMemberAll();

        return new ResponseEntity<>(
                ResDTO.builder()
                        .code(0)
                        .message("모든 멤버 정보 호출")
                        // .data(TodoDTO.ResBasic.fromEntityList(todoEntityList))
                        .data(MemberEntityList)
                        .build(),
                HttpStatus.OK);
        }


        //회원 가입
        @Transactional
        public HttpEntity<?> insertMember(MemberDTO.ReqJoin reqDto) {

        // 본인이 적은 글임을 DB에 넣어준다

                MemberEntity memberEntityForCheck = memberRepository.getMember(reqDto.getId());
                if (memberEntityForCheck != null) {
                        throw new BadRequestException("이미 사용 중인 아이디 입니다.");
                    }
                memberRepository.insertMember(reqDto.toEntity(passwordEncoder));

                return new ResponseEntity<>(
                        ResDTO.builder()
                                .code(0)
                                .message("할 일 추가에 성공하였습니다.")
                                .build(),
                        HttpStatus.OK);
        }

        @Transactional
        public HttpEntity<?> getMember(MemberDTO.ReqJoin reqDto){
                

                MemberEntity memberEntity = memberRepository.getMember(reqDto.getId());
                return new ResponseEntity<>(
                ResDTO.builder()
                        .code(0)
                        .data(memberEntity)
                        .build(),
                HttpStatus.OK);
        }

        //수정 기능
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

        //삭제기능
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
