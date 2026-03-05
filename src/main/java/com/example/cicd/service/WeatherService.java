package com.example.cicd.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.cicd.entity.WeatherHistory;
import com.example.cicd.repository.WeatherRepository;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherService {
	

	
	 private final String API_KEY = "bd7b677896fdf0709a8146dd663ea8cd";
	
	 private final WeatherRepository repository;

	    private final RestTemplate restTemplate = new RestTemplate();



	    public WeatherService(WeatherRepository repository){
	        this.repository = repository;
	    }
	

	 public WeatherHistory  getWeatherByCity(String city){

	        String url = "https://api.openweathermap.org/data/2.5/weather?q="
	                + city + "&appid=" + API_KEY + "&units=metric";

	        Map response = restTemplate.getForObject(url, Map.class);

	        Map main = (Map) response.get("main");
	        Map wind = (Map) response.get("wind");
	        List weatherList = (List) response.get("weather");
	        Map weather = (Map) weatherList.get(0);

	        WeatherHistory data = new WeatherHistory();
	        data.setCity(city);
	        data.setTemperature((Double) main.get("temp"));
	        data.setHumidity((Integer) main.get("humidity"));
	        data.setDescription((String) weather.get("description"));
	        data.setWindSpeed((Double) wind.get("speed"));
	        data.setCreatedAt(LocalDateTime.now());

	        return repository.save(data);
	    }
	

}
