package com.demo.dto;

import java.time.LocalDateTime;

public class StateData {

	String loc;
	private String totalCaseOfCountry;
	private String totalActiveCaseOfCountry;
	private String totalRecoveredOfCountry;
	private String totalDeathsOfCountry;
    int confirmedCasesIndian;
    int confirmedCasesForeign;
    int discharged;
    int deaths;
    int totalConfirmed;
    private String totalCaseOfState;
    private String totalRecoveredOfState;
    private String totalDeathsOfState;
    private String activeCases;
    private String mortalityRate;
    private String recoveryRate;
    private String lastUpdatedAt;
    
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getConfirmedCasesIndian() {
		return confirmedCasesIndian;
	}
	public void setConfirmedCasesIndian(int confirmedCasesIndian) {
		this.confirmedCasesIndian = confirmedCasesIndian;
	}
	public int getConfirmedCasesForeign() {
		return confirmedCasesForeign;
	}
	public void setConfirmedCasesForeign(int confirmedCasesForeign) {
		this.confirmedCasesForeign = confirmedCasesForeign;
	}
	public int getDischarged() {
		return discharged;
	}
	public void setDischarged(int discharged) {
		this.discharged = discharged;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getTotalConfirmed() {
		return totalConfirmed;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}
	

	public String getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(String string) {
		this.activeCases = string;
	}
	
	
	public String getTotalCaseOfCountry() {
		return totalCaseOfCountry;
	}
	public void setTotalCaseOfCountry(String string) {
		this.totalCaseOfCountry = string;
	}
	

	public String getMortalityRate() {
		return mortalityRate;
	}
	public void setMortalityRate(String mortalityRate) {
		this.mortalityRate = mortalityRate;
	}
	
	public String getRecoveryRate() {
		return recoveryRate;
	}
	public void setRecoveryRate(String recoveryRate) {
		this.recoveryRate = recoveryRate;
	}
	
	
	public String getTotalActiveCaseOfCountry() {
		return totalActiveCaseOfCountry;
	}
	public void setTotalActiveCaseOfCountry(String string) {
		this.totalActiveCaseOfCountry = string;
	}
	public String getTotalRecoveredOfCountry() {
		return totalRecoveredOfCountry;
	}
	public void setTotalRecoveredOfCountry(String string) {
		this.totalRecoveredOfCountry = string;
	}
	public String getTotalDeathsOfCountry() {
		return totalDeathsOfCountry;
	}
	public void setTotalDeathsOfCountry(String string) {
		this.totalDeathsOfCountry = string;
	}
	
	
	public String getTotalCaseOfState() {
		return totalCaseOfState;
	}
	public void setTotalCaseOfState(String totalCaseOfState) {
		this.totalCaseOfState = totalCaseOfState;
	}
	
	
	public String getTotalRecoveredOfState() {
		return totalRecoveredOfState;
	}
	public void setTotalRecoveredOfState(String totalRecoveredOfState) {
		this.totalRecoveredOfState = totalRecoveredOfState;
	}
	public String getTotalDeathsOfState() {
		return totalDeathsOfState;
	}
	public void setTotalDeathsOfState(String totalDeathsOfState) {
		this.totalDeathsOfState = totalDeathsOfState;
	}
	
	
	public String getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(String string) {
		this.lastUpdatedAt = string;
	}
	@Override
	public String toString() {
		return "StateData [loc=" + loc + ", confirmedCasesIndian=" + confirmedCasesIndian + ", confirmedCasesForeign="
				+ confirmedCasesForeign + ", discharged=" + discharged + ", deaths=" + deaths + ", totalConfirmed="
				+ totalConfirmed + "]";
	}
    
    
}
