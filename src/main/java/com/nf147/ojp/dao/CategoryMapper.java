package com.nf147.ojp.dao;

import com.nf147.ojp.entity.Category;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    Category selectByPrimaryKey(Integer id);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
}