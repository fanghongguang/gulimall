package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fanghongguang
 * @email fanghongguang@gmail.com
 * @date 2020-08-06 22:44:34
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
