package com.example.myBatis.myBatisTest.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder
public class Station {
	private String stationId;
	private String name;
	private Boolean hdEnabled;
	private String callSign;
	
	public Station(String stationId, String name, Boolean hdEnabled,String callSign) {
		super();
		this.stationId = stationId;
		this.name = name;
		this.hdEnabled = hdEnabled;
		this.callSign=callSign;
	}
	
	
	public Station(String name, Boolean hdEnabled,String callSign) {
		super();
		this.name = name;
		this.hdEnabled = hdEnabled;
		this.callSign=callSign;
	}

	public Station() {
	
	}
	
	
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getHdEnabled() {
		return hdEnabled;
	}
	public void setHdEnabled(Boolean hdEnabled) {
		this.hdEnabled = hdEnabled;
	}
	public String getCallSign() {
		return callSign;
	}
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

}
