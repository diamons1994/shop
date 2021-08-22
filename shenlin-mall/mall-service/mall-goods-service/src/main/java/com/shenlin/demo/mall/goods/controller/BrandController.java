package com.shenlin.demo.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shenlin.demo.mall.goods.model.Brand;
import com.shenlin.demo.mall.goods.service.BrandService;
import com.shenlin.mall.util.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : ShenLin
 * @date : 2021/8/11 20:38
 */
@Api(value = "product",tags = {"商品"})
@RestController
@RequestMapping(value = "/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @ApiOperation(value = "新增商品方法")
    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        brandService.save(brand);
        return RespResult.ok();
    }

    @ApiOperation(value = "修改商品方法")
    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return RespResult.ok();
    }

    @ApiOperation(value = "删除商品方法")
    @DeleteMapping ("/{id}")
    public RespResult delete(@PathVariable(value = "id")String id){
        brandService.removeById(id);
        return RespResult.ok();
    }

    @ApiOperation(value = "查询商品列表方法")
    @PostMapping(value = "/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand){
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    @ApiOperation(value = "分页获取商品列表")
    @PostMapping(value = "/search/{page}/{size}")
    public RespResult<Page<Brand>> queryPageList(@PathVariable(value = "page")Long page,
                                                 @PathVariable(value = "size")Long size,
                                                 @RequestBody Brand brand){
        Page<Brand> pageInfo = brandService.queryPageList(brand,page,size);
        return RespResult.ok(pageInfo);
    }

    @ApiOperation(value = "根据分类获取商品列表")
    @GetMapping(value = "/category/{pid}")
    public RespResult<Page<Brand>> categoryBrands(@PathVariable(value = "pid") Integer pid){
        List<Brand> brands = brandService.queryBrandByCategory(pid);
        return RespResult.ok(brands);
    }

}
