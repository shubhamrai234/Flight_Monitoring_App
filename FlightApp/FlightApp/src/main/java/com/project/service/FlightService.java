package com.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.FlightDao;
import com.project.model.Data;

@Service
public class FlightService {
	@Autowired
	FlightDao dao;
	
	public boolean addFlightDetails(Data data) {
		Data datas =dao.insert(data);
		if(datas!=null)
			return true;
		else
			return false;
	}
public List<Data> getFavourite(String id){
	List<Data> l = dao.findAll();
	List<Data> i=new ArrayList();
	for (Data data : l) {
		if(data.getUserId().equals(id)) {
			i.add(data);
		}
	}
	return i;
}
}
