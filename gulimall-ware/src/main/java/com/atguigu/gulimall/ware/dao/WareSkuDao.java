package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fanghongguang
 * @email fanghongguang@gmail.com
 * @date 2020-08-11 21:31:07
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
