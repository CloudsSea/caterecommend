package edu.njtu.mapper;

import edu.njtu.model.Attribute;

public interface AttributeMapper {
    int insert(Attribute record);

    int insertSelective(Attribute record);
}