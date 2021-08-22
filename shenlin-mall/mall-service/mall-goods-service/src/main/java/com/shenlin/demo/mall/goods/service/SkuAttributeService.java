package com.shenlin.demo.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shenlin.demo.mall.goods.model.SkuAttribute;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/20 22:41
 */
public interface SkuAttributeService extends IService<SkuAttribute> {

    /**
     * 根据分类ID查询属性加集合
     * @param id 分类ID
     * @return 属性加集合
     */
    List<SkuAttribute> queryList(Integer id);
}
