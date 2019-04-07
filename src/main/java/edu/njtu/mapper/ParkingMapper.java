package edu.njtu.mapper;

import edu.njtu.model.Parking;
import edu.njtu.model.ParkingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkingMapper {
    int countByExample(ParkingExample example);

    int deleteByExample(ParkingExample example);

    int insert(Parking record);

    int insertSelective(Parking record);

    List<Parking> selectByExample(ParkingExample example);

    int updateByExampleSelective(@Param("record") Parking record, @Param("example") ParkingExample example);

    int updateByExample(@Param("record") Parking record, @Param("example") ParkingExample example);
}