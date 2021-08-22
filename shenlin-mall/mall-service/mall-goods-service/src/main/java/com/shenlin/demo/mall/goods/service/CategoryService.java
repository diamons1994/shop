package com.shenlin.demo.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shenlin.demo.mall.goods.model.Category;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/20 22:44
 */
public interface CategoryService  extends IService<Category> {

    /**
     * 根据分类父ID查询所有子类
     * @param pid 父ID
     * @return 查询所有子类
     */
    List<Category> findByParentId(Integer pid);
}
