package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cicd.service.WeatherService;



@RestController
public class HelloController {
	
	
	private final WeatherService weatherService;
	
	public HelloController(WeatherService weatherService)
	{
		this.weatherService=weatherService;
	}
	
	
	  @GetMapping("/weather")
	    public String getWeather(@RequestParam String city){
	        return weatherService.getWeatherByCity(city);
	    }

}
