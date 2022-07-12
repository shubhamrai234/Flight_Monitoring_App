package com.project.model;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
@Id
private String number;

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public Flight(String number) {
	super();
	this.number = number;
}

public Flight() {
	super();
}

}
