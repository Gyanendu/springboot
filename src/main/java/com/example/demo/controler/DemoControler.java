package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServicePerson;

@RestController
public class DemoControler {
	@Autowired
	private ServicePerson servicePerson;
	
	public ServicePerson gerPersonData() {
		servicePerson.setId("1");
		servicePerson.setNamed("Gyanendu");
		servicePerson.setAge("32");
		servicePerson.setHeight("165cm");
		return servicePerson;
	}
}
