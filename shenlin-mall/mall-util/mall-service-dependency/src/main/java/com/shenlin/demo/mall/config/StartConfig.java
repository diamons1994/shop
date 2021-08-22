package com.shenlin.demo.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ShenLin
 * @date : 2021/8/15 20:55
 */
@Configuration
public class StartConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor   paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDbType(DbType.MYSQL);
        return paginationInterceptor;
    }
}
