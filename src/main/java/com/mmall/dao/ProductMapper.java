package com.mmall.dao;

import com.mmall.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 占超群
 * @data 2018/12/25 13:44
 */
@Mapper
public interface ProductMapper {
    int updateByPrimaryKey(Product record);

    int insert(Product record);

    int updateByPrimaryKeySelective(Product record);

    Product selectByPrimaryKey(Integer id);

    List<Product> selectList();

    List<Product> selectByNameAndProductId(@Param("productName")String productName, @Param("productId") Integer productId);

    List<Product> selectByNameAndCategoryIds(@Param("productName")String productName,@Param("categoryIdList")List<Integer> categoryIdList);

}
