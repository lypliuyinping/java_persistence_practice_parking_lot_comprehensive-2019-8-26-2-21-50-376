package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

@Service
public class ParkingBoyService {
	@Autowired
	private  ParkingBoyMapper parkingBoyMapper;

	public  List<ParkingBoy> selectAllParkingBoys() {
		return parkingBoyMapper.selectAll();
	}

	public  void insertParkingBoys(ParkingBoy parkingBoy) {
		parkingBoyMapper.insert(parkingBoy);
	}
	
	
}
