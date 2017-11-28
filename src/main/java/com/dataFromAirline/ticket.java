package com.dataFromAirline;

public class ticket {
	private String passengerName;
	private String flightNo;
	private String flightDate;
	private String ticketNo;
	private String certificateNo;
	private String carbinClass;
	private String dptAirport;
	private String arvAirport;
	private String depTime;
	private String arrTime;
	
	public ticket() {
		super();
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	
	public void setPassengerName(String name) {
		this.passengerName = name;
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
	
	public String getTicketNo() {
		return ticketNo;
	}
	
	public void setTicketNo(String ticketno) {
		this.ticketNo = ticketno;
	}
	
	public String getCertificateNo() {
		return certificateNo;
	}
	
	public void setCertificateNo(String id) {
		this.certificateNo = id;
	}
	
	public String getCarbinClass() {
		return carbinClass;
	}
	
	public void setCarbinClass(String carbin) {
		this.carbinClass = carbin;
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
