package edu.njtu.mapper;

import edu.njtu.model.Business;

public interface BusinessMapper {
    int deleteByPrimaryKey(String id);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}