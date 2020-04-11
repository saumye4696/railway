package com.railway.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.railway.dao.Dao01Int;

@Service(value = "userService")
public class Service01 implements Service01Int{
	@Autowired
	private Dao01Int userDao;
	
	public List<String> showPlacesService(String name) throws Exception{
		List<String> l1 = new ArrayList<String>();
		l1 = userDao.showPlaces(name);
		if(l1 == null) 
			throw new Exception("EXCEPTION_AAGAI_BHAI");
		return l1;
	}
}
