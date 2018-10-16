package com.practicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class Practica1Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}
	 @Bean
	    public Sampler defaultSampler(){
	        return Sampler.ALWAYS_SAMPLE;
	    }

}
