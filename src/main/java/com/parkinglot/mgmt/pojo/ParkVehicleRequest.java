package com.parkinglot.mgmt.pojo;

import com.parkinglot.mgmt.enums.ParkingRule;

public class ParkVehicleRequest {

	private CarInfo car;
	
	private ParkingRule parkingRule;

	public CarInfo getCar() {
		return car;
	}

	public void setCar(CarInfo car) {
		this.car = car;
	}

	public ParkingRule getParkingRule() {
		return parkingRule;
	}

	public void setParkingRule(ParkingRule parkingRule) {
		this.parkingRule = parkingRule;
	}
	
	
}
