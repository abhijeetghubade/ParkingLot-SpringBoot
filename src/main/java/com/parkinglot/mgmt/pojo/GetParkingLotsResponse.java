package com.parkinglot.mgmt.pojo;

public class GetParkingLotsResponse {

	private String name;
	
	private String capacity;
	
	private int parkingLotNumber;
	
	private int emptySlotCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getParkingLotNumber() {
		return parkingLotNumber;
	}

	public void setParkingLotNumber(int parkingLotNumber) {
		this.parkingLotNumber = parkingLotNumber;
	}

	public int getEmptySlotCount() {
		return emptySlotCount;
	}

	public void setEmptySlotCount(int emptySlotCount) {
		this.emptySlotCount = emptySlotCount;
	}
	
	
}
