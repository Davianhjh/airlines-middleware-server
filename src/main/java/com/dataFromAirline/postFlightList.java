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

import com.airline.flight;
import com.airline.flightManage;
import com.airline.flightManageRes;

@Path("/flightList")  
public class postFlightList {
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public postFlightListRes postList(@Context HttpHeaders hh, postFlightListParam fl) {
		String airlineCode;
		int dayLap;
		postFlightListRes res = new postFlightListRes();
		try {
			airlineCode = fl.getAirlineCode();
			dayLap = fl.getDayLap();
		} catch(RuntimeException e) {
			e.printStackTrace();
			res.setFlag("FAIL");
			res.setErrCode(1000);
			res.setErrMsg("Param error");
			return res;
		}
		try {
			flightManage fm = new flightManage(airlineCode);
			flightManageRes res2 = fm.getFlightList(dayLap);
			res.setFlag("SUCCESS");
			res.setFlights(res2.getFlights());
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
			res.setFlag("FAIL");
			res.setErrCode(2000);
			res.setErrMsg("Mysql server error");
			return res;
		}
	}
	
	public class postFlightListRes {
		private String flag;
		private int errCode;
		private String errMsg;
		private ArrayList<flight> flightList;
		
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
		
		public ArrayList<flight> getFlights(){
			return flightList;
		}
		
		public void setFlights(ArrayList<flight> flights) {
			this.flightList = new ArrayList<flight>(flights);
		}
	}
}
