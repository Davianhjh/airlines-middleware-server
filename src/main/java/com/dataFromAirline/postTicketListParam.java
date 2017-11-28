package com.dataFromAirline;

public class postTicketListParam {
	private static final long serialVersionUID = 1L;
    
    private String passengerName;
    private String passengerID;
    
    public postTicketListParam() {
    	super();
    }
    
    public String getPassengerName() {
    	return passengerName;
    }
    
    public void setPassengerName(String name) {
    	this.passengerName = name;
    }
    
    public String getPassengerID() {
    	return passengerID;
    }
    
    public void setPassengerID(String id) {
    	this.passengerID = id;
    }
    
}
