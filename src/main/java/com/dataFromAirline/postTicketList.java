package com.dataFromAirline;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.airline.ticket;
import com.airline.passengerFlight;
import com.airline.passengerFlightRes;

@Path("/ticketList") 
public class postTicketList {
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public postTicketListRes postList(@Context HttpHeaders hh, postTicketListParam tl) {
		String name = null;
		String id = null;
		postTicketListRes res = new postTicketListRes();
		try {
			name = tl.getPassengerName();
			id = tl.getPassengerID();
		} catch(RuntimeException e) {
			e.printStackTrace();
			res.setFlag("FAIL");
			res.setErrCode(1000);
			res.setErrMsg("Param error");
			return res;
		}
		try {
			passengerFlight pf = new passengerFlight(name,id);
			passengerFlightRes res2 = pf.getTicketList();
			res.setFlag("SUCCESS");
			res.setTickets(res2.getTickets());
			return res;
		} catch(SQLException e) {
			e.printStackTrace();
			res.setFlag("FAIL");
			res.setErrCode(2000);
			res.setErrMsg("Mysql server error");
			return res;
		}
	}
	
	public class postTicketListRes {
		private String flag;
		private int errCode;
		private String errMsg;
		private ArrayList<ticket> ticketList;
		
		public String getFlag() {
			return flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}
		
		public int getErrCode() {
			return errCode;
		}
		
		public void setErrCode(int code) {
			this.errCode = code;
		}
		
		public String getErrMsg() {
			return errMsg;
		}
		
		public void setErrMsg(String msg) {
			this.errMsg = msg;
		}
		
		public ArrayList<ticket> getTickets(){
			return ticketList;
		}
		
		public void setTickets(ArrayList<ticket> tickets) {
			this.ticketList = new ArrayList<ticket>(tickets);
		}
	}
}
