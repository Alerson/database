package com.information.database.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.information.database.error.ResourceNotFoundException;
import com.information.database.model.Pessoa;
import com.information.database.service.Service;

@CrossOrigin
@RequestMapping("api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	Service service;

	@GetMapping("info/{value}")
	public Pessoa getInforDataBase(@PathVariable String value) {
		if (value.equals("um")) {
			throw new ResourceNotFoundException("My Exception " + value);
		}
		return new Pessoa();
	}

}
