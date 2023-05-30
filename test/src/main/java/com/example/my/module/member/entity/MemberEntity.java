package com.example.my.module.member.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
    private String id;
    private String pw;
    private String name;
    private LocalDateTime regDate;
    private Integer gender;
    private String mail;
    private String grade;
    private String phone;
    private Integer mileage;
    private String authority;
}
