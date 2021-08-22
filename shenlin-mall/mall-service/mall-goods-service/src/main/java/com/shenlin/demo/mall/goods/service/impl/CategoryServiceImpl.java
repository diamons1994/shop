package com.shenlin.demo.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shenlin.demo.mall.goods.mapper.CategoryMapper;
import com.shenlin.demo.mall.goods.model.Category;
import com.shenlin.demo.mall.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/20 22:42
 */
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /***
     * 根据分类父ID查询所有子类
     */
    @Override
    public List<Category> findByParentId(Integer pid) {
        //条件封装对象
        QueryWrapper<Category> queryWrapper = new QueryWrapper<Category>();
        queryWrapper.eq("parent_id",pid);
        return categoryMapper.selectList(queryWrapper);
    }
}
