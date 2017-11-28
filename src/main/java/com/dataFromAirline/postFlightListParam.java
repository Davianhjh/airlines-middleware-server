package com.dataFromAirline;

public class postFlightListParam {
	private static final long serialVersionUID = 1L;
    
    private String airlineCode;
    private int dayLap;
    
    public postFlightListParam() {
    	super();
    }
    
    public void setAirlineCode(String code) {
    	this.airlineCode = code;
    }
    
    public String getAirlineCode() {
    	return airlineCode;
    }
    
    public void setDayLap(int day) {
    	this.dayLap = day;
    }
    
    public int getDayLap() {
    	return dayLap;
    }
}
