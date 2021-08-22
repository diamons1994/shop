package com.shenlin.demo.mall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shenlin.demo.mall.goods.mapper.SkuAttributeMapper;
import com.shenlin.demo.mall.goods.model.SkuAttribute;
import com.shenlin.demo.mall.goods.service.SkuAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/20 22:43
 */
@Service
public class SkuAttributeServiceImpl extends ServiceImpl<SkuAttributeMapper, SkuAttribute> implements SkuAttributeService {
    @Autowired
    private SkuAttributeMapper skuAttributeMapper;

    /*****
     * 根据分类ID查询属性集合
     * @param id
     * @return
     */
    @Override
    public List<SkuAttribute> queryList(Integer id) {
        return skuAttributeMapper.queryByCategoryId(id);
    }

}
