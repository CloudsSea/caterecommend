package edu.njtu.mapper;

import edu.njtu.model.HairTypesSpecializedIn;
import edu.njtu.model.HairTypesSpecializedInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HairTypesSpecializedInMapper {
    int countByExample(HairTypesSpecializedInExample example);

    int deleteByExample(HairTypesSpecializedInExample example);

    int insert(HairTypesSpecializedIn record);

    int insertSelective(HairTypesSpecializedIn record);

    List<HairTypesSpecializedIn> selectByExample(HairTypesSpecializedInExample example);

    int updateByExampleSelective(@Param("record") HairTypesSpecializedIn record, @Param("example") HairTypesSpecializedInExample example);

    int updateByExample(@Param("record") HairTypesSpecializedIn record, @Param("example") HairTypesSpecializedInExample example);
}