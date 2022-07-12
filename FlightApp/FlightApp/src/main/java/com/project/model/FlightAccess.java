package com.project.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightAccess {
private List<Data> data;

public List<Data> getData() {
	return data;
}

public void setData(List<Data> data) {
	this.data = data;
}

public FlightAccess(List<Data> data) {
	super();
	this.data = data;
}

public FlightAccess() {
	super();
}

	
}
