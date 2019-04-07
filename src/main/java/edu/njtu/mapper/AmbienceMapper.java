package edu.njtu.mapper;

import edu.njtu.model.Ambience;
import edu.njtu.model.AmbienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmbienceMapper {
    int countByExample(AmbienceExample example);

    int deleteByExample(AmbienceExample example);

    int insert(Ambience record);

    int insertSelective(Ambience record);

    List<Ambience> selectByExample(AmbienceExample example);

    int updateByExampleSelective(@Param("record") Ambience record, @Param("example") AmbienceExample example);

    int updateByExample(@Param("record") Ambience record, @Param("example") AmbienceExample example);
}