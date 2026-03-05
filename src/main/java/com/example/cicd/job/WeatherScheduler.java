package com.example.cicd.job;

import org.springframework.stereotype.Component;

import com.example.cicd.service.WeatherService;

@Component
public class WeatherScheduler {
	
	private final WeatherService weatherservice;
	
	public WeatherScheduler(WeatherService weatherservice)
	{
		this.weatherservice=weatherservice;
	}
	
	
	public void fetchWeatherAutomatically() {
		//String weather=weatherservice.getWeather(35.6895,139.6917);
		
		//System.out.println("Auto weather data"+weather);
	}
	
	

}
