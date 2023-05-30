package com.example.my.module.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.my.module.store.service.StoreService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StoreController {

    // private final TodoService todoService;/
    private final StoreService storeService;

    @GetMapping("/store_temp")
    public String storeList(Model model) {
        // model.addAttribute("storeDto", storeService.productAll());
        model.addAttribute("categoryDto", storeService.getCategory());
        return "store_temp";
    }

}
