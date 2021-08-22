package com.shenlin.demo.mall.goods.controller;

import com.shenlin.demo.mall.goods.model.Category;
import com.shenlin.demo.mall.goods.service.CategoryService;
import com.shenlin.mall.util.RespResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/18 22:02
 */
@Api(value = "category",tags = {"商品分类"})
@RestController
@RequestMapping(value = "/category")
@CrossOrigin
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    /****
     * 根据分类父ID查询子分类
     */
    @GetMapping(value = "/parent/{id}")
    public RespResult<List<Category>> findByParentId(@PathVariable("id")Integer id){
        return RespResult.ok(categoryService.findByParentId(id));
    }

}
