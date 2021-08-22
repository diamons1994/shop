package com.shenlin.demo.mall.goods.controller;

import com.shenlin.demo.mall.goods.model.Product;
import com.shenlin.demo.mall.goods.service.SpuService;
import com.shenlin.mall.util.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : ShenLin
 * @date : 2021/8/21 21:08
 */
@Api(value = "spu",tags = {"商品spu"})
@RestController
@RequestMapping(value = "/spu")
@CrossOrigin
public class SpuController {


    @Autowired
    private SpuService spuService;


    @ApiOperation(value = "产品保存")
    @PostMapping(value = "/save")
    public RespResult save(@RequestBody Product product){
        spuService.saveProduct(product);
        return RespResult.ok();
    }

}
