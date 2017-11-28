package com.dataFromAirline;

public class flight {
	private String flightNo;
	private String flightDate;
	private String dptAirport;
	private String arvAirport;
	private String depTime;
	private String arrTime;
	
	public flight() {
		super();
	}
	
	public String getFlightNo() {
		return flightNo;
	}
	
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	
	public String getFlightDate() {
		return flightDate;
	}
	
	public void setFlightDate(String date) {
		this.flightDate = date;
	}
	
	public String getDptAirport() {
		return dptAirport;
	}
	
	public void setDptAirport(String dptAirport) {
		this.dptAirport = dptAirport;
	}
	
	public String getArvAirport() {
		return arvAirport;
	}
	
	public void setArvAirport(String arvAirport) {
		this.arvAirport = arvAirport;
	}
	
	public String getDepTime() {
		return depTime;
	}
	
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	
	public String getArrTime() {
		return arrTime;
	}
	
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
}
