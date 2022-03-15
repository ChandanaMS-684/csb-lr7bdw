package com.example.demo.controller1;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dAOImplementation.CustomerDaoImplementation;
import com.example.demo.model.CustomerModel;

@Controller
@RequestMapping("/login")
public class logincontroller {
	@RequestMapping( value="/login",method = RequestMethod.GET)
	public String loginFormDisplay(Model model) {
		CustomerModel customerModel=new  CustomerModel();
		 model.addAttribute("customerModel1",customerModel);
         System.out.println("from show login**************" );
		return "login";	
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String verifylogin(CustomerModel customerModel,@RequestParam("username") String uname, @RequestParam("password")String pwd, BindingResult result) {
		System.out.println("from form**************" +customerModel.getFirstname() + customerModel);
        CustomerDaoImplementation c1=new CustomerDaoImplementation();
        try {
			c1.verify(uname, pwd);
			if(c1.verify(uname, pwd)==true) {
				return "Home";
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	return "login";	
	}	
}
