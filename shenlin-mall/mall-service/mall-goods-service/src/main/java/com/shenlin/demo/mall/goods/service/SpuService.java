package com.shenlin.demo.mall.goods.service;

import com.shenlin.demo.mall.goods.model.Product;

/**
 * @author : ShenLin
 * @date : 2021/8/21 21:11
 */
public interface SpuService {

    /**
     * 保存商品spu 和sku
     * @param product 商品信息
     */
    void saveProduct(Product product);

}
