package com.mmall.dao;

import com.mmall.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 占超群
 * @data 2018/12/30 16:03
 */
@Mapper
public interface OrderMapper {
    //二期新增定时关单
    List<Order> selectOrderStatusByCreateTime(@Param("status") Integer status, @Param("date") String date);

    int closeOrderByOrderId(Integer id);
}
