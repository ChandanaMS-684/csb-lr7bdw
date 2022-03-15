package com.example.demo.controller1;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dAO.CustomerDAO;
import com.example.demo.dAOImplementation.CustomerDaoImplementation;
import com.example.demo.model.CustomerModel;


@Controller
@RequestMapping("/register")

public class FormController {
	@Autowired
	CustomerDAO customerDaoImplementation;
	@RequestMapping(method = RequestMethod.GET)
	public String registrationFormDisplay(Model model) {
		CustomerModel customerModel=new  CustomerModel();
		 model.addAttribute("customerModel",customerModel);
         System.out.println("from show login**************" );
		return "register";		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String userAddDataBase(CustomerModel customerModel, BindingResult result) {
		
        CustomerDaoImplementation c1=new CustomerDaoImplementation();
        c1.addUser(customerModel); 
        return "login";	
	}
	
	
	
	@ModelAttribute("country")
	public List<String> getCountries(){
		List<String> country = new ArrayList<String>();
		country.add("India");
		country.add("Australia");
		country.add("UK");
		country.add("US");
		return country;
	}
		
	@ModelAttribute("state")
	public List<String> getStates(){
		List<String> state = new ArrayList<String>();
		state.add("Karnataka");
		state.add("QueensLand");
		state.add("England");
		state.add("California");
		return state;
		}
		
		@ModelAttribute("city")
		public List<String> getCity(){
			List<String> city = new ArrayList<String>();
			city.add("Bangalore");
			city.add("Melbourne");
			city.add("London");
			city.add("Los Angeles");
			return city;
	
}
}