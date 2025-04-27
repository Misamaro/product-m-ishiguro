package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductMapper;

/**
 * 在庫情報 Service
 */
@Service
public class ProductTopService {
    /**
     * 在庫情報 Mapper
     */
    @Autowired
    private ProductMapper productMapper;

    /**
     * 在庫情報検索
     * @return 検索結果
     */
    public List<Product> searchAll() {
    	 return productMapper.searchAll();
    }

    
}