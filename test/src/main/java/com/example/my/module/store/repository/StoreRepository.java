package com.example.my.module.store.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.my.module.store.entity.StoreEntity;

@Repository
@Mapper
public interface StoreRepository {

    List<StoreEntity> productAll();

    Integer countCategory();

    List<StoreEntity> getCategory();

    List<StoreEntity> getProductCategory(String category);

    List<StoreEntity> getHighLight();

    StoreEntity selectProduct(Integer idx);

    Integer insertProduct(StoreEntity storeEntity);

    Integer modifyProduct(StoreEntity storeEntity);

    Integer deleteProduct(Integer idx);

}
