package edu.njtu.mapper;

import edu.njtu.model.Elite;
import edu.njtu.model.EliteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EliteMapper {
    int countByExample(EliteExample example);

    int deleteByExample(EliteExample example);

    int deleteByPrimaryKey(String id);

    int insert(Elite record);

    int insertSelective(Elite record);

    List<Elite> selectByExample(EliteExample example);

    Elite selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Elite record, @Param("example") EliteExample example);

    int updateByExample(@Param("record") Elite record, @Param("example") EliteExample example);

    int updateByPrimaryKeySelective(Elite record);

    int updateByPrimaryKey(Elite record);
}