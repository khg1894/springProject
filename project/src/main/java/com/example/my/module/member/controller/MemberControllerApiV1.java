package com.example.my.module.member.controller;

import org.springframework.http.HttpEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my.module.member.dto.MemberDTO;
import com.example.my.module.member.service.MemberServiceApiV1;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class MemberControllerApiV1 {

    private final MemberServiceApiV1 memberServiceApiV1;

    @PostMapping("/join")
    public HttpEntity<?> joinProc(@Validated @RequestBody MemberDTO.ReqJoin reqDto) {
        return memberServiceApiV1.insertMember(reqDto);
    }
}
