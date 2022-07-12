package com.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airline {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Airline(String name) {
	super();
	this.name = name;
}

public Airline() {
	super();
}

}
