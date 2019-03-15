package edu.njtu.mapper;

import edu.njtu.model.Tip;

public interface TipMapper {
    int insert(Tip record);

    int insertSelective(Tip record);
}