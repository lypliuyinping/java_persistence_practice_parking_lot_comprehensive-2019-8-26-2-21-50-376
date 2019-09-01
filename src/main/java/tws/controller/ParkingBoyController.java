package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.repository.ParkingBoyMapper;
import tws.repository.ParkingLotMapper;
import tws.service.ParkingBoyService;
import tws.service.ParkingLotService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parkingBoys")
public class ParkingBoyController {
@Autowired 
ParkingBoyService parkingBoyService;
ParkingLotService parkingLotService;
//    @Autowired
//    private ParkingBoyMapper parkingBoyMapper;
//    @Autowired
//    private ParkingLotMapper parkingLotMapper;
    
    @GetMapping("")
    public ResponseEntity<List<ParkingBoy>> getAll() {
      //  List<ParkingBoy> parkingBoy=parkingBoyMapper.selectAll();
    	List<ParkingBoy> parkingBoy=parkingBoyService.selectAllParkingBoys();
        return ResponseEntity.ok(parkingBoy);
    }
    
    @PostMapping("")
    public ResponseEntity<ParkingBoy> insert(@RequestBody ParkingBoy parkingBoy) {
       // parkingBoyMapper.insert(parkingBoy);
    	parkingBoyService.insertParkingBoys(parkingBoy);   	
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }  
    
    @GetMapping("/{parkingBoyID}/parkingLots")
    public ResponseEntity<List<ParkingLot>> getAllParkinglotOfOneParkingBoy(@PathVariable("parkingBoyID") int parkingBoyID){
    // return ResponseEntity.ok(parkingLotMapper.selectParkinglotIdbyOneParkingboy(parkingBoyID));
    	 List<ParkingLot> parkingLots =parkingLotService.selectParkinglotIdbyOneParkingboy(parkingBoyID);
    	return ResponseEntity.ok(parkingLots);
    }    
}
