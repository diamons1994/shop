package com.shenlin.demo.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shenlin.demo.mall.goods.model.Brand;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/11 20:36
 */
public interface BrandService extends IService<Brand> {

    /**
     * 名称 首字母条件查询
     *
     * @param brand 参数
     * @return 结果集
     */
    List<Brand> queryList(Brand brand);

    /**
     * 分页查询
     * @param brand 分类信息
     * @param currentPage 页码
     * @param size 分页大小
     * @return 分页列表
     */
    Page<Brand> queryPageList(Brand brand, Long currentPage, Long size);

    /**
     * 根据分类ID获得商品
     * @param id 分类id
     * @return 商品集合
     */
    List<Brand> queryBrandByCategory(Integer id);
}
