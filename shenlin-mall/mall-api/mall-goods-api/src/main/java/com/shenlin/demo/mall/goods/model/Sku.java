package com.shenlin.demo.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : ShenLin
 * @date : 2021/8/20 23:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sku")
public class Sku {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;
    private Integer price;
    private Integer num;
    private String image;
    private String images;
    private Date createTime;
    private Date updateTime;
    private String spuId;
    private Integer categoryId;
    private String categoryName;
    private Integer brandId;
    private String brandName;
    private String skuAttribute;
    private Integer status;

}
