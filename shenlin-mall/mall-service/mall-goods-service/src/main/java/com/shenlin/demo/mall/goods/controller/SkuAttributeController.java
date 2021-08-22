package com.shenlin.demo.mall.goods.controller;

import com.shenlin.demo.mall.goods.model.SkuAttribute;
import com.shenlin.demo.mall.goods.service.SkuAttributeService;
import com.shenlin.mall.util.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/20 22:59
 */
@Api(value = "sku",tags = {"商品sku"})
@RestController
@RequestMapping(value = "/skuAttribute")
@CrossOrigin
public class SkuAttributeController {

    @Autowired
    private SkuAttributeService skuAttributeService;

    @ApiOperation(value = "根据分类ID查询属性集合")
    @GetMapping(value = "/category/{id}")
    public RespResult<List<SkuAttributeController>> categorySkuAttributeList(@PathVariable(value = "id")Integer id){
        List<SkuAttribute> skuAttributes = skuAttributeService.queryList(id);
        return RespResult.ok(skuAttributes);
    }
}
