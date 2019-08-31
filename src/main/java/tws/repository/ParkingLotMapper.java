package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingLot;


import java.util.List;

@Mapper
public interface ParkingLotMapper {

    List<ParkingLot> selectAll();

    void insert(@Param("parkingLot") ParkingLot parkingLot);
    
    @Select("select parkingLotID from `parking_lot` where parkingBoyID = #{parkingBoyID};")
    List<Integer> selectParkinglotIdbyOneParkingboy(@Param("parkingBoyID") int parkingBoyID);
}
