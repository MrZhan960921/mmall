package com.mmall.dao;

import com.mmall.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 占超群
 * @data 2018/12/30 16:13
 */
@Mapper
public interface OrderItemMapper {
    List<OrderItem> getByOrderNo(@Param("orderNo")Long orderNo);
}
