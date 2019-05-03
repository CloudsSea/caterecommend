package edu.njtu.mapper;

import edu.njtu.model.RecommendDefault;
import edu.njtu.model.RecommendDefaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendDefaultMapper {
    int countByExample(RecommendDefaultExample example);

    int deleteByExample(RecommendDefaultExample example);

    int deleteByPrimaryKey(String businessId);

    int insert(RecommendDefault record);

    int insertSelective(RecommendDefault record);

    List<RecommendDefault> selectByExample(RecommendDefaultExample example);

    RecommendDefault selectByPrimaryKey(String businessId);

    int updateByExampleSelective(@Param("record") RecommendDefault record, @Param("example") RecommendDefaultExample example);

    int updateByExample(@Param("record") RecommendDefault record, @Param("example") RecommendDefaultExample example);

    int updateByPrimaryKeySelective(RecommendDefault record);

    int updateByPrimaryKey(RecommendDefault record);
}