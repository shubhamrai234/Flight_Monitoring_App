package com.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
private String flight_date;
private String flight_status;
private Departure departure;
private Arrival arrival;
private Airline airline;
private Flight flight;

private String userId;
public String getFlight_date() {
	return flight_date;
}
public void setFlight_date(String flight_date) {
	this.flight_date = flight_date;
}
public String getFlight_status() {
	return flight_status;
}
public void setFlight_status(String flight_status) {
	this.flight_status = flight_status;
}
public Departure getDeparture() {
	return departure;
}
public void setDeparture(Departure departure) {
	this.departure = departure;
}
public Arrival getArrival() {
	return arrival;
}
public void setArrival(Arrival arrival) {
	this.arrival = arrival;
}
public Airline getAirline() {
	return airline;
}
public void setAirline(Airline airline) {
	this.airline = airline;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}

public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}

public Data(String flight_date, String flight_status, Departure departure, Arrival arrival, Airline airline,
		Flight flight, String userId) {
	super();
	this.flight_date = flight_date;
	this.flight_status = flight_status;
	this.departure = departure;
	this.arrival = arrival;
	this.airline = airline;
	this.flight = flight;
	this.userId = userId;
}
public Data() {
	super();
}


	
}
