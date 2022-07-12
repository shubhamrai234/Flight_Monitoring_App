package com.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Departure {
	private String airport;
	private String timezone;
	private String scheduled;
	private String estimated;
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	public String getEstimated() {
		return estimated;
	}
	public void setEstimated(String estimated) {
		this.estimated = estimated;
	}
	public Departure(String airport, String timezone, String scheduled, String estimated) {
		super();
		this.airport = airport;
		this.timezone = timezone;
		this.scheduled = scheduled;
		this.estimated = estimated;
	}
	public Departure() {
		super();
	}
	

}
