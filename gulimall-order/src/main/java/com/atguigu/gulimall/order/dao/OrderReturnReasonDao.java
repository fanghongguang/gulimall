package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author fanghongguang
 * @email fanghongguang@gmail.com
 * @date 2020-08-11 21:24:31
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
