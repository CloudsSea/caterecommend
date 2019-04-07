package edu.njtu.mapper;

import edu.njtu.model.DietaryRestrictions;
import edu.njtu.model.DietaryRestrictionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DietaryRestrictionsMapper {
    int countByExample(DietaryRestrictionsExample example);

    int deleteByExample(DietaryRestrictionsExample example);

    int insert(DietaryRestrictions record);

    int insertSelective(DietaryRestrictions record);

    List<DietaryRestrictions> selectByExample(DietaryRestrictionsExample example);

    int updateByExampleSelective(@Param("record") DietaryRestrictions record, @Param("example") DietaryRestrictionsExample example);

    int updateByExample(@Param("record") DietaryRestrictions record, @Param("example") DietaryRestrictionsExample example);
}