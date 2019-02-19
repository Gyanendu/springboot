package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControlerH2Database {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="createTable", method=RequestMethod.GET)
	public void createTable() {
		try {
			jdbcTemplate.execute("CREATE TABLE EMPLOYEE (id SERIAL, name VARCHAR(255), age VARCHAR(255))");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@RequestMapping(value="putData", method=RequestMethod.GET)
	public void putDataTable() {
		try {
			jdbcTemplate.execute("INSERT INTO EMPLOYEE (id , name, age) VALUES(1, 'Gyanendu','32')");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
