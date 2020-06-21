package com.parkinglot.mgmt.enums;

public enum ParkingRule {

	fillFirst("fillFirst"),
	
	evenDistribution("evenDistribution");
	
	private String parkingRule;

	public String getParkingRule() {
		return parkingRule;
	}
	
	ParkingRule(String parkingRule) {
		this.parkingRule = parkingRule;
	}
}
