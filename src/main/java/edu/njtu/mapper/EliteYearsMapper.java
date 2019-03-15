package edu.njtu.mapper;

import edu.njtu.model.EliteYears;

public interface EliteYearsMapper {
    int insert(EliteYears record);

    int insertSelective(EliteYears record);
}