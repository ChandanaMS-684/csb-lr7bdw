package com.example.demo.controller1.rest;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dAO.CustomerDAO;
import com.example.demo.model.CustomerModel;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class UserRestController {
	
	@Autowired
	CustomerDAO  customerDAO;
	
	@PostMapping(value = "/rest/register",consumes = "application/json", produces = "application/json")
	public int registerCustomer(@RequestBody CustomerModel customer){
		System.out.println(customer);
		int rowsinserted  = customerDAO.addUser(customer);
		return rowsinserted;
	}
	
	@GetMapping(value = "/rest/getcustomer",produces = "application/json")
	public CustomerModel getCustomer(@PathVariable("username") String username){
		CustomerModel customerModel  = customerDAO.getCustomerDetails();
		return customerModel;
	}
	
	
	@PostMapping(value="/rest/verify/{username}/{password}",produces="application/json")
	public boolean verifyLogin(@PathVariable("username") String username,@PathVariable("password")String password) throws SQLException { 
	
		boolean flag1=customerDAO.verify(username, password);
		return flag1;
	
	}
	
	@PostMapping(value = "/rest/update",consumes = "application/json", produces = "application/json")
	public boolean updateCustomerAddress(@RequestBody CustomerModel customer,@PathVariable("username")String username){
		boolean updatedrow =customerDAO.changeAddress(username, customer);
		return updatedrow;
	}
	
	
	
}
