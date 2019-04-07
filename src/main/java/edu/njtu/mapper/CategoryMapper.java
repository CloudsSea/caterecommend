package edu.njtu.mapper;

import edu.njtu.model.Categories;
import edu.njtu.model.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int insert(Categories record);

    int insertSelective(Categories record);

    List<Categories> selectByExample(CategoryExample example);

    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Categories record, @Param("example") CategoryExample example);
}