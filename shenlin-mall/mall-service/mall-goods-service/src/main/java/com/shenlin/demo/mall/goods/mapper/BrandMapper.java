package com.shenlin.demo.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shenlin.demo.mall.goods.model.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : ShenLin
 * @date: 2021/8/7 22:57
 */
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 根据分类id查找品牌ID集合
     * @param id 分类ID
     * @return 品牌ID集合
     */
    @Select(value = "select brand_id from category_brand where category_id =#{id}")
    List<Integer> queryBrandIds(Integer id);
}
