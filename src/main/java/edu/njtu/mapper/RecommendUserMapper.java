package edu.njtu.mapper;

import edu.njtu.model.RecommendUser;
import edu.njtu.model.RecommendUserExample;
import edu.njtu.model.RecommendUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecommendUserMapper {
    int countByExample(RecommendUserExample example);

    int deleteByExample(RecommendUserExample example);

    int deleteByPrimaryKey(RecommendUserKey key);

    int insert(RecommendUser record);

    int insertSelective(RecommendUser record);

    List<RecommendUser> selectByExample(RecommendUserExample example);

    RecommendUser selectByPrimaryKey(RecommendUserKey key);

    int updateByExampleSelective(@Param("record") RecommendUser record, @Param("example") RecommendUserExample example);

    int updateByExample(@Param("record") RecommendUser record, @Param("example") RecommendUserExample example);

    int updateByPrimaryKeySelective(RecommendUser record);

    int updateByPrimaryKey(RecommendUser record);
}