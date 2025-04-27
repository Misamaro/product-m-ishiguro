package com.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Product {
    /**
     * ID
     */
    private Integer id;

    /**
     * 商品名
     */
    private String prodName;

    /**
     * 個数
     */
    private Integer quantity;

    /**
     * 価格
     */
    private Integer price;

    /**
     * 削除フラグ
     */
    private boolean deleteFlg;

    /**
     * 更新日
     */
    private Date updateDate;
    
    /**
     * 登録日
     */
    private Date createDate;
}