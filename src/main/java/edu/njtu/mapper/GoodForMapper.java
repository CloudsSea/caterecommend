package edu.njtu.mapper;

import edu.njtu.model.GoodFor;
import edu.njtu.model.GoodForExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodForMapper {
    int countByExample(GoodForExample example);

    int deleteByExample(GoodForExample example);

    int insert(GoodFor record);

    int insertSelective(GoodFor record);

    List<GoodFor> selectByExample(GoodForExample example);

    int updateByExampleSelective(@Param("record") GoodFor record, @Param("example") GoodForExample example);

    int updateByExample(@Param("record") GoodFor record, @Param("example") GoodForExample example);
}