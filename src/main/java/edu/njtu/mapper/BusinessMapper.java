package edu.njtu.mapper;

import edu.njtu.model.Business;
import edu.njtu.model.BusinessExample;
import edu.njtu.model.BusinessKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
    int countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(BusinessKey key);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(BusinessKey key);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}