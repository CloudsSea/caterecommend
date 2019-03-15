package edu.njtu.mapper;

import edu.njtu.model.CheckIn;

public interface CheckInMapper {
    int insert(CheckIn record);

    int insertSelective(CheckIn record);
}