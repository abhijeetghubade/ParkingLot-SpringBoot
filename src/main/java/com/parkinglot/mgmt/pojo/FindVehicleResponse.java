package com.parkinglot.mgmt.pojo;

public class FindVehicleResponse {

	private int parkingLotNumber;
	
	private int slotNumber;
	
	private int parkingId;

	public int getParkingLotNumber() {
		return parkingLotNumber;
	}

	public void setParkingLotNumber(int parkingLotNumber) {
		this.parkingLotNumber = parkingLotNumber;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	
	
}
