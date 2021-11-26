package com.kh.parkingtower.model.vo;

public class Car {
	
	private int availableNum;
	private int nomalType;
	private int smallType;
	private int parkingTowerNum;
	private int parkingFee;
	private int parkingNum;
	private int carNum;
	private String carType;
	private int insertTime;
	private int outTime;
	
	
	public Car() {}


	public Car(int availableNum, int nomalType, int smallType, int parkingTowerNum, int parkingFee, int parkingNum,
			int carNum, String carType, int insertTime, int outTime) {
		this.availableNum = availableNum;
		this.nomalType = nomalType;
		this.smallType = smallType;
		this.parkingTowerNum = parkingTowerNum;
		this.parkingFee = parkingFee;
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.insertTime = insertTime;
		this.outTime = outTime;
	}


	public int getAvailableNum() {
		return availableNum;
	}


	public void setAvailableNum(int availableNum) {
		this.availableNum = availableNum;
	}


	public int getNomalType() {
		return nomalType;
	}


	public void setNomalType(int nomalType) {
		this.nomalType = nomalType;
	}


	public int getSmallType() {
		return smallType;
	}


	public void setSmallType(int smallType) {
		this.smallType = smallType;
	}


	public int getParkingTowerNum() {
		return parkingTowerNum;
	}


	public void setParkingTowerNum(int parkingTowerNum) {
		this.parkingTowerNum = parkingTowerNum;
	}


	public int getParkingFee() {
		return parkingFee;
	}


	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}


	public int getParkingNum() {
		return parkingNum;
	}


	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}


	public int getCarNum() {
		return carNum;
	}


	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public int getInsertTime() {
		return insertTime;
	}


	public void setInsertTime(int insertTime) {
		this.insertTime = insertTime;
	}


	public int getOutTime() {
		return outTime;
	}


	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}


	@Override
	public String toString() {
		return "Car [availableNum=" + availableNum + ", nomalType=" + nomalType + ", smallType=" + smallType
				+ ", parkingTowerNum=" + parkingTowerNum + ", parkingFee=" + parkingFee + ", parkingNum=" + parkingNum
				+ ", carNum=" + carNum + ", carType=" + carType + ", insertTime=" + insertTime + ", outTime=" + outTime
				+ "]";
	}

	
	
	
}
