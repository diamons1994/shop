package com.shenlin.demo.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shenlin.demo.mall.goods.model.Sku;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/22 21:45
 */
public interface SkuService extends IService<Sku> {

    /**
     * 根据产品推广分类ID查询指定分类下的产品列表
     * @param id 分类ID
     * @return  产品列表
     */
    List<Sku> typeSkuItems(Integer id);

    void delTypeSkuItems(Integer id);

    List<Sku> updateTypeSkuItems(Integer id);

}
