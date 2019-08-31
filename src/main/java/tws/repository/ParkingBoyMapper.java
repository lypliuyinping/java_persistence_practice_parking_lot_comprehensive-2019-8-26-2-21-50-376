package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingBoy;

import java.util.List;

@Mapper
public interface ParkingBoyMapper {

	
    List<ParkingBoy> selectAll();

    void insert(@Param("parkingBoy") ParkingBoy parkingBoy);
}
