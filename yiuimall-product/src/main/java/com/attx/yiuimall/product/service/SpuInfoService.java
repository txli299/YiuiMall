package com.attx.yiuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.attx.common.utils.PageUtils;
import com.attx.yiuimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author TxLi
 * @email txli299@gmail.com
 * @date 2023-05-09 17:56:45
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

