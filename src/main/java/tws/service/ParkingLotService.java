package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;

@Service
public class ParkingLotService {
	@Autowired
	private  ParkingLotMapper parkingLotMapper;

	
	public List<ParkingLot> selectAllParkingLot() {
	return	parkingLotMapper.selectAll();
	}


	public void insert(@RequestBody ParkingLot parkingLot) {
		parkingLotMapper.insert(parkingLot);
	}


	public List<ParkingLot> selectParkinglotIdbyOneParkingboy(int parkingBoyID) {
		return parkingLotMapper.selectParkinglotIdbyOneParkingboy(parkingBoyID);
	}
	
}
