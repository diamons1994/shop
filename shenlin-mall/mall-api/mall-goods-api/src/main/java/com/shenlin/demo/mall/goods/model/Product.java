package com.shenlin.demo.mall.goods.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/20 23:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    // Spu
    private Spu spu;
    // Sku
    private List<Sku> skus;
}
