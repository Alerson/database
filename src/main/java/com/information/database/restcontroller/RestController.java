package com.information.database.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.information.database.service.Service;

@CrossOrigin
@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	Service service;

}
