package com.example.my.module.store.dto;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;

import com.example.my.module.member.entity.MemberEntity;
import com.example.my.module.store.entity.StoreEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StoreDTO {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResBasic {
        private List<Store> storeList;
        private Member member;
        // 해당 static class 내부에서만 사용하는 클래스
        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        static class Member {
            String id;
            String authority;
            String name;
        }

        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Store {
            Integer idx;
            String name;
            String detail;
            String image;
            String category;
            Integer price;
            Integer status;
            Integer highlight;
        }

        // 엔티티에서 DTO로 변환, 팩토리 메소드
        public static ResBasic fromUserEntityList(List<StoreEntity> storeEntityList, MemberEntity memberEntity) {
            // map 기존 리스트 데이터를 다른 타입의 리스트 데이터로 변경
            Member member = Member.builder()
                    .id(memberEntity.getId())
                    .authority(memberEntity.getAuthority())
                    .name(memberEntity.getName())
                    .build();


            List<Store> storeList = storeEntityList.stream().map(storeEntity -> {
                return Store.builder()
                        .idx(storeEntity.getIdx())
                        .name(storeEntity.getName())
                        .detail(storeEntity.getDetail())
                        .image(storeEntity.getImage())
                        .category(storeEntity.getCategory())
                        .price(storeEntity.getPrice())
                        .status(storeEntity.getStatus())
                        .highlight(storeEntity.getHighlight())
                        .build();
            }).collect(Collectors.toList());

            return new ResBasic(storeList,member);
        }
    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResCategory {
        

        private List<Category> categoryList;
        // 해당 static class 내부에서만 사용하는 클래스

        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Category {
            String category;
        }

        // 엔티티에서 DTO로 변환, 팩토리 메소드
        public static ResCategory fromEntityList(List<StoreEntity> categoryEntityList) {
            // map 기존 리스트 데이터를 다른 타입의 리스트 데이터로 변경
            List<Category> categoryList = categoryEntityList.stream().map(storeEntity -> {
                return Category.builder()
                        .category(storeEntity.getCategory())
                        .build();
            }).collect(Collectors.toList());

            return new ResCategory(categoryList);
        }
    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReqBasic {

        @NotBlank(message = "내용을 입력해 주세요.")
        private String name;
        private String detail;
        private String image;
        private String category;
        private Integer price;
        private Integer status;
        private Integer highlight;

        public StoreEntity toEntity() {
            return StoreEntity.builder()
                    .name(name)
                    .detail(detail)
                    .image(image)
                    .category(category)
                    .price(price)
                    .status(status)
                    .highlight(highlight)
                    .build();
        }
    }

}
