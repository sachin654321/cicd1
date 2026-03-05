package com.example.cicd.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	
	private final RestTemplate restTemplate=new RestTemplate();
	
	 private final String API_KEY = "bd7b677896fdf0709a8146dd663ea8cd";
	
	public String getWeather(String city)
	{
		String url= "https://api.openweathermap.org/data/2.5/weather?q="
                + city +
                "&appid=" + API_KEY +
                "&units=metric";
		
		return restTemplate.getForObject(url,String.class);
	}
	
	

	public String getWeatherByCity(String city) {
		// TODO Auto-generated method stub
		 String apiKey = "bd7b677896fdf0709a8146dd663ea8cd";

	        String url = "https://api.openweathermap.org/data/2.5/weather?q="
	                + city + "&appid=" + apiKey + "&units=metric";

	        RestTemplate restTemplate = new RestTemplate();

	        return restTemplate.getForObject(url, String.class);
	}
	

}
