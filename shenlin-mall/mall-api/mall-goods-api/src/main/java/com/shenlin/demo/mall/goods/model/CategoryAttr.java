package com.shenlin.demo.mall.goods.model;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName(value = "category_attr")
public class CategoryAttr {
    @TableField
    private Integer categoryId;

    @TableField
    private Integer attrId;

}
