package com.attx.yiuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.attx.common.utils.PageUtils;
import com.attx.yiuimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author TxLi
 * @email txli299@gmail.com
 * @date 2023-05-09 17:56:45
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

