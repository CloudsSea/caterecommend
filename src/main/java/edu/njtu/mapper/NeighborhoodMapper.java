package edu.njtu.mapper;

import edu.njtu.model.Neighborhood;
import edu.njtu.model.NeighborhoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeighborhoodMapper {
    int countByExample(NeighborhoodExample example);

    int deleteByExample(NeighborhoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(Neighborhood record);

    int insertSelective(Neighborhood record);

    List<Neighborhood> selectByExample(NeighborhoodExample example);

    Neighborhood selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Neighborhood record, @Param("example") NeighborhoodExample example);

    int updateByExample(@Param("record") Neighborhood record, @Param("example") NeighborhoodExample example);

    int updateByPrimaryKeySelective(Neighborhood record);

    int updateByPrimaryKey(Neighborhood record);
}