package com.demo.covidAlertService.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.AlertStatus;
import com.demo.dto.StateData;
import com.demo.dto.SumarryData;

@Service
public class AlertService {
	@Autowired
	private Covid19DataProvider covid19DataProvider;
	public StateData getAlertState(String state)
	{
		StateData stateData=covid19DataProvider.getStateDetails(state);
		AlertStatus alertStatus=new AlertStatus();
		alertStatus.setAlertLevel("GREEN");
		alertStatus.setMeasures(Arrays.asList("Everything is ok!!!!11"));
		return stateData;
		
	}
	public List<StateData> getSumarry() {
		return covid19DataProvider.getSumarry("Sumarry");
	}
	
	
}
