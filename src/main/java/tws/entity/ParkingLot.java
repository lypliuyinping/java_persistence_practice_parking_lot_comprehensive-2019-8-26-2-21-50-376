package tws.entity;

public class ParkingLot {
    private int parkingLotID;
    private int capatity;
    private int availablePositionCount;
    private int parkingBoyID;

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotID, int capatity, int availablePositionCount, int parkingBoyID) {
        this.parkingLotID = parkingLotID;
        this.capatity = capatity;
        this.availablePositionCount = availablePositionCount;
        this.parkingBoyID = parkingBoyID;
    }

    public int getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public int getCapatity() {
        return capatity;
    }

    public void setCapatity(int capatity) {
        this.capatity = capatity;
    }

    public int getAvailablePositionCount() {
        return availablePositionCount;
    }

    public void setAvailablePositionCount(int availablePositionCount) {
        this.availablePositionCount = availablePositionCount;
    }

    public int getParkingBoyID() {
        return parkingBoyID;
    }

    public void setParkingBoyID(int parkingBoyID) {
        this.parkingBoyID = parkingBoyID;
    }
}
