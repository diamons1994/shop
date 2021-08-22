package com.shenlin.demo.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: ShenLin
 * @date: 2021/8/7 22:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category")
public class Category implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer sort;
    private Integer parentId;
}
