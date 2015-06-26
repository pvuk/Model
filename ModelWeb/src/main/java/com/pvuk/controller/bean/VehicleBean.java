package com.pvuk.controller.bean;

import java.util.Date;
import java.util.List;

public class VehicleBean {

	private Integer vehicleId;
	private String registrationNumber;
	private String vehicleTypeId;

	private List<String> vehicleTypes;

	private String name;
	private String phoneNumber;
	private String address;
	private Date inTime;
	private Date outTime;
	private Boolean isTokenLost;
	private Boolean isMonthlyPass;

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(String vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public List<String> getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(List<String> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public Boolean getIsTokenLost() {
		return isTokenLost;
	}

	public void setIsTokenLost(Boolean isTokenLost) {
		this.isTokenLost = isTokenLost;
	}

	public Boolean getIsMonthlyPass() {
		return isMonthlyPass;
	}

	public void setIsMonthlyPass(Boolean isMonthlyPass) {
		this.isMonthlyPass = isMonthlyPass;
	}
}
