package com.demo.dto;

import java.util.List;

public class AlertStatus {

	private String alertLevel;
	List<String> measures;
	public String getAlertLevel() {
		return alertLevel;
	}
	public void setAlertLevel(String alertLevel) {
		this.alertLevel = alertLevel;
	}
	public List<String> getMeasures() {
		return measures;
	}
	public void setMeasures(List<String> measures) {
		this.measures = measures;
	}
	
	

}
