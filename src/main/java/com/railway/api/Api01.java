package com.railway.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.model.User;
import com.railway.service.Service01;
import com.railway.service.Service01Int;

@RestController
@RequestMapping(value = "/railway")
public class Api01 {
	@Autowired
	private Service01Int userService;
	
	@GetMapping(value = "/railway/{name}")
	public ResponseEntity<List<String>> showPlaces(@PathVariable String name) throws Exception{
		List<String> l1 = new ArrayList<String>();
		l1 = userService.showPlacesService(name);
		ResponseEntity<List<String>> response = new ResponseEntity<List<String>>(l1, HttpStatus.OK);
		return response;
	}

}
