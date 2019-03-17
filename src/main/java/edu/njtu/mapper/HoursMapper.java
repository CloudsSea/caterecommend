package edu.njtu.mapper;

import edu.njtu.model.Hours;
import edu.njtu.model.HoursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoursMapper {
    int countByExample(HoursExample example);

    int deleteByExample(HoursExample example);

    int insert(Hours record);

    int insertSelective(Hours record);

    List<Hours> selectByExample(HoursExample example);

    int updateByExampleSelective(@Param("record") Hours record, @Param("example") HoursExample example);

    int updateByExample(@Param("record") Hours record, @Param("example") HoursExample example);
}