package com.pranav.model;

public class Lane {

	String FirstLane;
	String SecondLane;
	String ThirdLane;
	@Override
	public String toString() {
		return "Lane [FirstLane=" + FirstLane + ", SecondLane=" + SecondLane + ", ThirdLane=" + ThirdLane + "]";
	}
	public Lane(String firstLane, String secondLane, String thirdLane) {
		super();
		FirstLane = firstLane;
		SecondLane = secondLane;
		ThirdLane = thirdLane;
	}
	public Lane() {
		super();
	}
	public String getFirstLane() {
		return FirstLane;
	}
	public void setFirstLane(String firstLane) {
		FirstLane = firstLane;
	}
	public String getSecondLane() {
		return SecondLane;
	}
	public void setSecondLane(String secondLane) {
		SecondLane = secondLane;
	}
	public String getThirdLane() {
		return ThirdLane;
	}
	public void setThirdLane(String thirdLane) {
		ThirdLane = thirdLane;
	}
	
}
