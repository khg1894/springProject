package com.example.teamproject.module.board.dto;

import com.example.teamproject.module.board.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BoardDTO {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReqBasic {

        @NotBlank(message = "내용을 입력해 주세요.")
        private String id;
        private String name;
        private String subject;
        private String content;
        private String secret;
        private String filename;

        public BoardEntity toEntity() {
            return BoardEntity.builder()
                    .id(id)
                    .name(name)
                    .subject(subject)
                    .content(content)
                    .secret(secret)
                    .filename(filename)
                    .build();
        }

    }


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResBasic {
        private List<Board> boardList;

        // 해당 static class 내부에서만 사용하는 클래스
        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Board {
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

        // 엔티티에서 DTO로 변환, 팩토리 메소드
        public static ResBasic fromEntityList(List<BoardEntity> boardEntityList) {
            // map 기존 리스트 데이터를 다른 타입의 리스트 데이터로 변경
            List<Board> boardList
                    = boardEntityList.stream().map(boardEntity ->
                                    {
                                        return Board.builder()
                                                .idx(boardEntity.getIdx())
                                                .id(boardEntity.getId())
                                                .name(boardEntity.getName())
                                                .subject(boardEntity.getSubject())
                                                .content(boardEntity.getContent())
                                                .secret(boardEntity.getSecret())
                                                .filename(boardEntity.getFilename())
                                                .reg_date(boardEntity.getReg_date())
                                                .count(boardEntity.getCount())
                                                .answer(boardEntity.getAnswer())
                                                .build();
                                    }).collect(Collectors.toList());

            return new ResBasic(boardList);
        }
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResMy{
        private User user;
        private List<ResBasic.Board> boardList;

        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        static class User{
            String id;
        }

        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        static class Board {
            Integer idx;
            String content;
            Character doneYn;
        }


    }
}
