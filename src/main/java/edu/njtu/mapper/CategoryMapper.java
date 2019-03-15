package edu.njtu.mapper;

import edu.njtu.model.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}