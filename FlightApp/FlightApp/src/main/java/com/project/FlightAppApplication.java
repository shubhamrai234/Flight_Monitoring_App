package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.project.filter.FlightFilter;

@SpringBootApplication
public class FlightAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAppApplication.class, args);
	}
    @Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
    @Bean
	public FilterRegistrationBean flightFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.setFilter(new FlightFilter());
		filter.addUrlPatterns("/flightapp/*");
		return filter;
	}
}
