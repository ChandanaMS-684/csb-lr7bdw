package com.example.demo.dAO;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.CustomerModel;

public interface CustomerDAO {

public boolean verify(String username,String passWord) throws SQLException ;
	
	public int addUser(CustomerModel cust) ;
	
	public  boolean changeAddress(String username ,CustomerModel customerModel) ;
	
	public boolean addtoCustomerGroup(int custId,int groupId) ;
	
	public CustomerModel getCustomerDetails() ;

}
