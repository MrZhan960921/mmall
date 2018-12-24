package com.mmall.dao;

import com.mmall.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 占超群
 * @data 2018/12/24 16:20
 */
@Mapper
public interface CategoryMapper {
    int insert(Category record);

    int updateByPrimaryKeySelective(Category record);

    List<Category> selectCategoryChildrenByParentId(Integer parentId);

    Category selectByPrimaryKey(Integer id);
}
