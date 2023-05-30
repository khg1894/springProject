package com.example.my.module.store.controller;

import org.springframework.http.HttpEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my.config.security.CustomUserDetails;
import com.example.my.module.store.service.StoreServiceApiV1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/store")
public class StoreControllerApiV1 {

    private final StoreServiceApiV1 storeServiceApi;

    @GetMapping("/card")
    public HttpEntity<?> productAll(
        @AuthenticationPrincipal CustomUserDetails customUserDetails
    ) {
        log.info("리스트를 가져옵니다.");
        return storeServiceApi.productAll(customUserDetails);
    }

    @GetMapping("/category")
    public HttpEntity<?> getCategory() {
        log.info("카테고리 목록을 가져옵니다.");
        return storeServiceApi.getCategory();
    }

    // @PostMapping
    // public HttpEntity<?> insertProduct(
    //         @AuthenticationPrincipal CustomUserDetails customUserDetails,
    //         @Validated @RequestBody StoreDTO.ReqBasic reqDto) {
    //     // log.info("할 일 ()" + reqDto.getContent() + ") 추가를 요청합니다.");/
    //     return storeServiceApi.insertProduct(reqDto);
    // }

    // @PutMapping("/{idx}")
    // public HttpEntity<?> modifyProduct(
    //         @AuthenticationPrincipal CustomUserDetails customUserDetails,
    //         @Validated @RequestBody StoreDTO.ReqBasic reqDto) {
    //     return storeServiceApi.modifyProduct(reqDto);
    // }

    // @DeleteMapping("/{idx}")
    // public HttpEntity<?> deleteProduct(
    //         @AuthenticationPrincipal CustomUserDetails customUserDetails,
    //         @PathVariable Integer idx) {
    //     log.warn(idx + "번 할 일 삭제를 요청합니다.");
    //     return storeServiceApi.deleteProduct(customUserDetails, idx);
    // }
}
