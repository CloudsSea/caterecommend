package edu.njtu.mapper;

import edu.njtu.model.CheckIn;
import edu.njtu.model.CheckInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckInMapper {
    int countByExample(CheckInExample example);

    int deleteByExample(CheckInExample example);

    int insert(CheckIn record);

    int insertSelective(CheckIn record);

    List<CheckIn> selectByExample(CheckInExample example);

    int updateByExampleSelective(@Param("record") CheckIn record, @Param("example") CheckInExample example);

    int updateByExample(@Param("record") CheckIn record, @Param("example") CheckInExample example);
}