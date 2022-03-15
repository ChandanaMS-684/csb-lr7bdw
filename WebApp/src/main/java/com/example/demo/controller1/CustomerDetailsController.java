package com.example.demo.controller1;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dAOImplementation.CustomerDaoImplementation;
import com.example.demo.model.CustomerModel;

@Controller
@RequestMapping("/Home")
public class CustomerDetailsController {
	@RequestMapping( value="/Home",method  = RequestMethod.GET)
	
	
		public String getPersons(@RequestParam("username") String uname,Model model){
	
		 CustomerModel cust=new CustomerModel();
		  CustomerDaoImplementation c1=new CustomerDaoImplementation();
		  List<CustomerModel> l= (List<CustomerModel>) c1.getCustomerDetails(); 
		  model.addAttribute("details", cust);
	return "Home";
		
	}
}
