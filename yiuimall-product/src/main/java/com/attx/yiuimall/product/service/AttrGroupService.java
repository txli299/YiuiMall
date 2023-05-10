package com.attx.yiuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.attx.common.utils.PageUtils;
import com.attx.yiuimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author TxLi
 * @email txli299@gmail.com
 * @date 2023-05-09 17:56:45
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

