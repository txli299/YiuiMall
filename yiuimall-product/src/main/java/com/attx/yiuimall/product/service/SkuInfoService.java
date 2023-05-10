package com.attx.yiuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.attx.common.utils.PageUtils;
import com.attx.yiuimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author TxLi
 * @email txli299@gmail.com
 * @date 2023-05-09 17:56:45
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

