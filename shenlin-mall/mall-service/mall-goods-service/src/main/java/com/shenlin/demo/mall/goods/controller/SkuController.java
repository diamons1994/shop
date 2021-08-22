package com.shenlin.demo.mall.goods.controller;

import com.shenlin.demo.mall.goods.model.Sku;
import com.shenlin.demo.mall.goods.service.SkuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/22 22:05
 */
@RestController
@RequestMapping(value = "/sku")
public class SkuController {

    @Autowired
    private SkuService skuService;

    @ApiOperation(value = "根据推广分类查询推广产品列表")
    @GetMapping(value = "/aditems/type")
    public List<Sku> typeItems(@RequestParam(value = "id")Integer id){
        //查询
        List<Sku> skus = skuService.typeSkuItems(id);
        return skus;
    }
}
