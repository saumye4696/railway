package com.railway.dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class Dao01 implements Dao01Int {
	public List<String> showPlaces(String name){
		List<String> l1 = new ArrayList<String>();
		
		//creating a result list to return 
		l1.add("delhi");
		l1.add("bangalore");
		l1.add("mysore");
		if(name.equals("saumye")) {
			return l1;
		}
		else {
			return null;
		}
	}
}
