package com.shenlin.demo.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shenlin.demo.mall.goods.mapper.BrandMapper;
import com.shenlin.demo.mall.goods.model.Brand;
import com.shenlin.demo.mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/11 20:36
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name",brand.getName());
        queryWrapper.eq("initial",brand.getInitial());
        return brandMapper.selectList(queryWrapper);
    }

    @Override
    public Page<Brand> queryPageList(Brand brand, Long currentPage, Long size) {

        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name",brand.getName());
        return brandMapper.selectPage(new Page<Brand>(currentPage,size),queryWrapper);
    }

    @Override
    public List<Brand> queryBrandByCategory(Integer id) {
        List<Integer> brandIds = brandMapper.queryBrandIds(id);
        if(brandIds!=null && brandIds.size()>0){
            return brandMapper.selectList(new QueryWrapper<Brand>().in("id",brandIds));
        }
        return null;
    }


}
