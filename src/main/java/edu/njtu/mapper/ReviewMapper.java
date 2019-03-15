package edu.njtu.mapper;

import edu.njtu.model.Review;

public interface ReviewMapper {
    int deleteByPrimaryKey(String id);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKeyWithBLOBs(Review record);

    int updateByPrimaryKey(Review record);
}