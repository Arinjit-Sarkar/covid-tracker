package com.demo.covidAlertService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.covidAlertService.service.AlertService;
import com.demo.dto.StateData;

@Controller
public class AlertController {

	@Autowired
	private AlertService alertService;
	@GetMapping("/")
	public String getSumarry(Model model,Model modelNew)
	{
		model.addAttribute("data", alertService.getSumarry());
		model.addAttribute("totalCases", alertService.getSumarry().get(0).getTotalCaseOfCountry());
		model.addAttribute("totalActiveCases", alertService.getSumarry().get(0).getTotalActiveCaseOfCountry());
		model.addAttribute("totalRecovered", alertService.getSumarry().get(0).getTotalRecoveredOfCountry());
		model.addAttribute("totalDeaths", alertService.getSumarry().get(0).getTotalDeathsOfCountry());
		model.addAttribute("updatedTime", alertService.getSumarry().get(0).getLastUpdatedAt());
		return "covidData";
	}
	
	@GetMapping("India/{state}")
	public StateData getStateDetails(@PathVariable String state)
	{
		return alertService.getAlertState(state);
		
	}
	
	

}
