package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 订单
 *
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2026-03-27 15:30:47
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

    int updateStatus(@Param("orderToken") String orderToken, @Param("expectStatus") Integer expectStatus, @Param("targetStatus") Integer targetStatus);
}
