package edu.njtu.mapper;

import edu.njtu.model.Attribute;
import edu.njtu.model.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {
    int countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    List<Attribute> selectByExampleWithBLOBs(AttributeExample example);

    List<Attribute> selectByExample(AttributeExample example);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);
}