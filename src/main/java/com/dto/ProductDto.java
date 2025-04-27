package com.dto;

import lombok.Data;

@Data
class ProductDto {

	/**
	 * ID
	 */
	public Integer id;

	/**
	 * 商品名
	 */
	public String prodName;
	/**
	 * 個数
	 */
	public Integer quantity;
	/**
	 * 価格
	 */
	public Integer price;	
	

}
