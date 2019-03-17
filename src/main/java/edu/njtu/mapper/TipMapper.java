package edu.njtu.mapper;

import edu.njtu.model.Tip;
import edu.njtu.model.TipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipMapper {
    int countByExample(TipExample example);

    int deleteByExample(TipExample example);

    int insert(Tip record);

    int insertSelective(Tip record);

    List<Tip> selectByExampleWithBLOBs(TipExample example);

    List<Tip> selectByExample(TipExample example);

    int updateByExampleSelective(@Param("record") Tip record, @Param("example") TipExample example);

    int updateByExampleWithBLOBs(@Param("record") Tip record, @Param("example") TipExample example);

    int updateByExample(@Param("record") Tip record, @Param("example") TipExample example);
}