package com.example.my.module.store.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.my.config.security.CustomUserDetails;
import com.example.my.module.member.repository.MemberRepository;
import com.example.my.module.store.dto.StoreDTO;
import com.example.my.module.store.repository.StoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreService {
    private final StoreRepository storeRepository;
    private final MemberRepository memberRepository;
    // public StoreDTO.ResBasic productAll(CustomUserDetails userDetails){
    //     return StoreDTO.ResBasic.fromUserEntityList(storeRepository.productAll(),memberRepository.getMember());
    // }
    public StoreDTO.ResCategory getCategory(){
        return StoreDTO.ResCategory.fromEntityList(storeRepository.getCategory());
    }
}
