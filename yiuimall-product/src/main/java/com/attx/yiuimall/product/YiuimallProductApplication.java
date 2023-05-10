package com.attx.yiuimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.attx.yiuimall.product.dao")
@SpringBootApplication
public class YiuimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiuimallProductApplication.class, args);
    }

}
