package com.example.myBatis.myBatisTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.myBatis.myBatisTest.Repo.StationMyBatisRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBatisTestApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StationMyBatisRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(MyBatisTestApplication.class, args);
	}
	
	
	
}
