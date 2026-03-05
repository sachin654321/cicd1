package com.example.cicd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cicd.entity.WeatherHistory;



@Repository
public interface WeatherRepository extends JpaRepository<WeatherHistory, Long> {

}
