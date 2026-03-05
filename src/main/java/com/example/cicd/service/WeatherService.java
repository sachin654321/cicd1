package com.example.cicd.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	
	private final RestTemplate restTemplate=new RestTemplate();
	
	public String getWeather(double latitude, double longitude)
	{
		String url= "https://api.open-meteo.com/v1/forecast?latitude=" 
                + latitude + "&longitude=" + longitude + "&hourly=temperature_2m";
		
		return restTemplate.getForObject(url,String.class);
	}

}
