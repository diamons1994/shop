package com.shenlin.demo.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : ShenLin
 * @date : 2021/8/22 22:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_items")
public class AdItems implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer type;
    private String skuId;
    private Integer sort;
}
