package com.pranav.model;

import java.util.List;

public class Address {

	List<Lane> lane;
	String city;
	String State;
	int pincode;
	@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}
	public Address(List<Lane> lane, String city, String state, int pincode) {
		super();
		this.lane = lane;
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public List<Lane> getLane() {
		return lane;
	}
	public void setLane(List<Lane> lane) {
		this.lane = lane;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
