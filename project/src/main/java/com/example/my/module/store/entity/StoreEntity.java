package com.example.my.module.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreEntity {
    private Integer idx;
    private String name;
    private String detail;
    private String image;
    private String category;
    private Integer price;
    private Integer status;
    private Integer highlight;

}
