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
	
	@GetMapping("/")
	public String hello()
	{
		return "Java Microservice running";
	}
	
	@GetMapping("/weather")
	public String getWeather(@RequestParam double lat,@RequestParam double lon)
	{
		return weatherService.getWeather(lat,lon);
	}

}
