package com.shenlin.demo.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : ShenLin
 * @date : 2021/8/20 23:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "spu")
public class Spu {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String name;
    private String intro;
    private Integer brandId;
    private Integer categoryOneId;
    private Integer categoryTwoId;
    private Integer categoryThreeId;
    private String images;
    private String afterSalesService;
    private String content;
    private String attributeList;
    private Integer isMarketable;
    private Integer isDelete;
    private Integer status;

}
