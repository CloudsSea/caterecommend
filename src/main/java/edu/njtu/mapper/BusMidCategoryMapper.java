package edu.njtu.mapper;

import edu.njtu.model.BusMidCategory;
import edu.njtu.model.BusMidCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusMidCategoryMapper {
    int countByExample(BusMidCategoryExample example);

    int deleteByExample(BusMidCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(BusMidCategory record);

    int insertSelective(BusMidCategory record);

    List<BusMidCategory> selectByExample(BusMidCategoryExample example);

    BusMidCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BusMidCategory record, @Param("example") BusMidCategoryExample example);

    int updateByExample(@Param("record") BusMidCategory record, @Param("example") BusMidCategoryExample example);

    int updateByPrimaryKeySelective(BusMidCategory record);

    int updateByPrimaryKey(BusMidCategory record);
}