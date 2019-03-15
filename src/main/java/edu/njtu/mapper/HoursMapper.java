package edu.njtu.mapper;

import edu.njtu.model.Hours;

public interface HoursMapper {
    int insert(Hours record);

    int insertSelective(Hours record);
}