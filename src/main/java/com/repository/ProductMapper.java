package com.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.entity.Product;

@Mapper
public interface ProductMapper {

    /**
     * 在庫情報検索
     * @param 
     * @return 在庫情報
     */
	public List<Product> searchAll();

}



