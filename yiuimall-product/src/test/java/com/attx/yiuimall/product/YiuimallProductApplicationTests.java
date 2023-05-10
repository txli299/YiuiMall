package com.attx.yiuimall.product;

import com.attx.yiuimall.product.entity.BrandEntity;
import com.attx.yiuimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YiuimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName(("Huawei"));
        brandService.save(brandEntity);
        System.out.println("Save successfully...");
    }

}
