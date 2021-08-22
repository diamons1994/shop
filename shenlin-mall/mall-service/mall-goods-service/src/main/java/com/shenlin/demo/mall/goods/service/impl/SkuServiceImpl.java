package com.shenlin.demo.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shenlin.demo.mall.goods.mapper.AdItemsMapper;
import com.shenlin.demo.mall.goods.mapper.SkuMapper;
import com.shenlin.demo.mall.goods.model.AdItems;
import com.shenlin.demo.mall.goods.model.Sku;
import com.shenlin.demo.mall.goods.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : ShenLin
 * @date : 2021/8/22 21:55
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements SkuService {

    @Autowired
    private AdItemsMapper adItemsMapper;

    @Autowired
    private SkuMapper skuMapper;
    @Override
    public List<Sku> typeSkuItems(Integer id) {
        //1.查询当前分类下的所有列表信息
        QueryWrapper<AdItems> adItemsQueryWrapper = new QueryWrapper<>();
        adItemsQueryWrapper.eq("type",id);
        List<AdItems> adItems = adItemsMapper.selectList(adItemsQueryWrapper);

        //2.根据推广列表查询产品列表信息
        List<String> skuIds = adItems.stream().map(AdItems::getSkuId).collect(Collectors.toList());
        return skuIds==null || skuIds.size()<=0? null : skuMapper.selectBatchIds(skuIds);
    }

    @Override
    public void delTypeSkuItems(Integer id) {

    }

    @Override
    public List<Sku> updateTypeSkuItems(Integer id) {
        return null;
    }
}
