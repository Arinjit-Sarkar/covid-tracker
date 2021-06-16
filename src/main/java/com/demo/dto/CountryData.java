package com.demo.dto;

import java.util.Arrays;

public class CountryData {

	private SumarryData summary;
	private StateData[] regional;

	public StateData[] getRegional() {
		return regional;
	}
	public void setRegional(StateData[] regional) {
		this.regional = regional;
	}
	public SumarryData getSummary() {
		return summary;
	}
	public void setSummary(SumarryData summary) {
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "CountryData [summary=" + summary + ", regional=" + Arrays.toString(regional) + "]";
	}
	
	
}
