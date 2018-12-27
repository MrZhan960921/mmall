package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 占超群
 * @data 2018/12/27 15:12
 */
@Mapper
public interface CartMapper {

    List<Cart> selectCartByUserId(Integer userId);

    int updateByPrimaryKeySelective(Cart record);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId")Integer productId);

    int insert(Cart record);

    int updateByPrimaryKey(Cart record);

    int deleteByUserIdProductIds(@Param("userId") Integer userId,@Param("productIdList")List<String> productIdList);

    int checkedOrUncheckedProduct(@Param("userId") Integer userId,@Param("productId")Integer productId,@Param("checked") Integer checked);

    int selectCartProductCount(@Param("userId") Integer userId);

}
