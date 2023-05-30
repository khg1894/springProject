package com.example.my.module.member.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.my.module.member.entity.MemberEntity;

@Repository
@Mapper
public interface MemberRepository {

    List<MemberEntity> getMemberAll();

    List<String> getMemberIdAll();

    MemberEntity getMember(String id);

    MemberEntity insertMember(MemberEntity memberEntity);

}
