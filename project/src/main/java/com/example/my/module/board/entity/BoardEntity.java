package com.example.my.module.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
    private Integer idx;
    private String id;
    private String name;
    private String subject;
    private String content;
    private String secret;
    private String filename;
    private String reg_date;
    private Integer count;
    private String answer;
    
}
