package com.demo.covidAlertService.service;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.dto.AlertStatus;
import com.demo.dto.CovidAPIData;
import com.demo.dto.StateData;
import com.demo.dto.SumarryData;

@Service
public class Covid19DataProvider {



	@Autowired
	private Covid19DataProvider covid19DataProvider;
	
	final String url="https://api.rootnet.in/covid19-in/stats/latest";
	@Autowired
	RestTemplate template;
	
	public StateData getStateDetails(String state) {
		CovidAPIData covidData= template.getForObject(url, CovidAPIData.class);
		StateData stateData= Arrays.stream(covidData.getData().getRegional()).filter(e -> e.getLoc().equalsIgnoreCase(state)).findAny().orElse(new StateData());
		System.out.println(stateData);
		return stateData;
	}

	public List<StateData> getSumarry(String sumarry) {
		CovidAPIData covidData= template.getForObject(url, CovidAPIData.class);
		System.out.println(covidData.getData().getRegional());
		StateData[] stateData=new StateData[covidData.getData().getRegional().length+2];
		stateData=covidData.getData().getRegional();
		
		int totalCaseOfCountry=0;
		int totalActiveCaseOfCountry = 0;
		int totalRecoveredOfCountry=0;
	    int totalDeathsOfCountry=0;
	    
		int totalCaseOfState;
		int deaths;
		int recovered;
		
		System.out.println(stateData.length);
		NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("en", "IN"));//   getCurrencyInstance();

		for(int i=0;i<stateData.length;i++)
		{
			
 
			totalCaseOfState=stateData[i].getConfirmedCasesIndian();
			
			totalCaseOfCountry+=totalCaseOfState;
			
			
			deaths=stateData[i].getDeaths();
			recovered=stateData[i].getDischarged();
			int active=totalCaseOfState-(deaths+recovered);
			
			totalActiveCaseOfCountry+=active;
			totalRecoveredOfCountry+=recovered;
			totalDeathsOfCountry+=deaths;
			
			double mortalityRate=(deaths*100)/recovered;
			double recoveryRate=(recovered*100)/totalCaseOfState;
			stateData[i].setActiveCases(formatter.format(active));
			stateData[i].setMortalityRate(mortalityRate+"%");
			stateData[i].setRecoveryRate(recoveryRate+"%");
			stateData[i].setTotalCaseOfState(formatter.format(totalCaseOfState));
			stateData[i].setTotalRecoveredOfState(formatter.format(recovered));
			stateData[i].setTotalDeathsOfState(formatter.format(deaths));
			System.out.println(mortalityRate+"%");
			
			//System.out.println(myData[i]);
		}
		 //System.out.print(formatter.format(totalCaseOfCountry));
		stateData[0].setTotalCaseOfCountry(formatter.format(totalCaseOfCountry));
		stateData[0].setTotalActiveCaseOfCountry(formatter.format(totalActiveCaseOfCountry));
		stateData[0].setTotalRecoveredOfCountry(formatter.format(totalRecoveredOfCountry));
		stateData[0].setTotalDeathsOfCountry(formatter.format(totalDeathsOfCountry));
		//DateTimeFormatter sdf=new DateTimeFormatter(null, null, null, null, null, null, null);
		stateData[0].setLastUpdatedAt((covidData.getLastOriginUpdate().toLocalDateTime().toLocalDate() +"-"+covidData.getLastOriginUpdate().toLocalDateTime().toLocalTime() +" "+"IST"));
		SumarryData sumarryData= covidData.getData().getSummary();
		sumarryData.setUpdateTime(covidData.getLastOriginUpdate());
		//System.out.println(sumarryData.toString());
		return Arrays.asList(stateData);
	}


}
