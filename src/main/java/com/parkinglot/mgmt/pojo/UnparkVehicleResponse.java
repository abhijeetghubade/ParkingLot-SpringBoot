package com.parkinglot.mgmt.pojo;

public class UnparkVehicleResponse {

	private CarInfo car;
	
	private int billAmount;
	
	private double durationOfParking;
	
	private int perHourRate;

	public CarInfo getCar() {
		return car;
	}

	public void setCar(CarInfo car) {
		this.car = car;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public double getDurationOfParking() {
		return durationOfParking;
	}

	public void setDurationOfParking(double durationOfParking) {
		this.durationOfParking = durationOfParking;
	}

	public int getPerHourRate() {
		return perHourRate;
	}

	public void setPerHourRate(int perHourRate) {
		this.perHourRate = perHourRate;
	}
	
	
}
