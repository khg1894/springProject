package com.example.my.module.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.my.module.member.entity.MemberEntity;
import com.example.my.module.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;

    public List<MemberEntity> getMemberAll(){
        return memberRepository.getMemberAll();
    }

}
