package edu.njtu.mapper;

import edu.njtu.model.Compliment;
import edu.njtu.model.ComplimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplimentMapper {
    int countByExample(ComplimentExample example);

    int deleteByExample(ComplimentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Compliment record);

    int insertSelective(Compliment record);

    List<Compliment> selectByExample(ComplimentExample example);

    Compliment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Compliment record, @Param("example") ComplimentExample example);

    int updateByExample(@Param("record") Compliment record, @Param("example") ComplimentExample example);

    int updateByPrimaryKeySelective(Compliment record);

    int updateByPrimaryKey(Compliment record);
}