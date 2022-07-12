package com.project.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.model.Data;
import com.project.model.FlightAccess;
import com.project.service.FlightService;
import com.sun.net.httpserver.HttpServer;




@RestController
public class FlightController {
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	FlightService flightService;
	
	public FlightController(FlightService flightService) {
		this.flightService=flightService;
	}
	ResponseEntity<?> response;
	List<Data> dataList;
	
	
	@GetMapping("/flightapp/getflight")
	public ResponseEntity<?> getFlights(){
		FlightAccess o= restTemplate.getForObject("http://api.aviationstack.com/v1/flights?access_key=3f4ff48e0ab6cc2cbed19e0ab92c636f", FlightAccess.class);
		dataList=o.getData();
		response= new ResponseEntity<List<Data>>(dataList,HttpStatus.OK);
		return response;
		}
	@PostMapping("/flightapp/add/{id}")
	public ResponseEntity<?> addFlight(@PathVariable String id,ServletRequest request){
		String us = (String)request.getAttribute("username");
		for (Data data : dataList) {
			if(data.getFlight().getNumber().equals(id)) {
				data.setUserId(us);
			flightService.addFlightDetails(data);}
		}
		
		
			response= new ResponseEntity<String>("favourite object added succesfully",HttpStatus.CREATED);
		
			
		return response;
	}
	
	@GetMapping("/flightapp/view")
	public ResponseEntity<?> viewFavourite(ServletRequest request){
		String us = (String)request.getAttribute("username");
		List<Data> d = flightService.getFavourite(us);
		response= new ResponseEntity<List<Data>>(d,HttpStatus.OK);
		return response;
	}

}
