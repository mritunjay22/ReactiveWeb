package com.reactiveMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
//@ComponentScan({"com.reactiveMongo.Configuration","com.reactiveMongo.Controller","com.reactiveMongo.Entity","com.reactiveMongo.Repo","com.reactiveMongo.Service"})
//Component Scam if all the Classes are in Different Package

public class RestApiWebfluxMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiWebfluxMongoApplication.class, args);
	}
	
 
	
	}

 