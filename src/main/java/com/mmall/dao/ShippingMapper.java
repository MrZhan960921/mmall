package com.mmall.dao;

import com.mmall.pojo.Shipping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 占超群
 * @data 2018/12/27 17:45
 */
@Mapper
public interface ShippingMapper {
    int insert(Shipping record);

    int deleteByShippingIdUserId(@Param("userId")Integer userId, @Param("shippingId") Integer shippingId);

}
