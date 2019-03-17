package edu.njtu.mapper;

import edu.njtu.model.EliteYears;
import edu.njtu.model.EliteYearsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EliteYearsMapper {
    int countByExample(EliteYearsExample example);

    int deleteByExample(EliteYearsExample example);

    int insert(EliteYears record);

    int insertSelective(EliteYears record);

    List<EliteYears> selectByExample(EliteYearsExample example);

    int updateByExampleSelective(@Param("record") EliteYears record, @Param("example") EliteYearsExample example);

    int updateByExample(@Param("record") EliteYears record, @Param("example") EliteYearsExample example);
}