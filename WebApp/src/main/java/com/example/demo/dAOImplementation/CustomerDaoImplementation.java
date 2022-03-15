package com.example.demo.dAOImplementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dAO.CustomerDAO;
import com.example.demo.model.CustomerModel;


@Component
public class CustomerDaoImplementation implements CustomerDAO  {

	/*
	 * @Autowired DBConnection dBConnection;
	 */
	public int addUser(CustomerModel cust) {
		int row=0;
		try {
		
			DBConnection dBConnection = new DBConnection();
		PreparedStatement ps=dBConnection.getconnection().prepareStatement("INSERT INTO customer (firstName,lastName,userName,passWord,mobileNo,alternateMobno,emailId,country,state,city,street,pinCode) VALUES\r\n" + 
				" (?,?,?,?,?,?,?,?,?,?,?,?)");
	 
	    ps.setString(1,cust.getFirstname());
	    ps.setString(2, cust.getLastname());
	    ps.setString(3, cust.getUsername());
	    ps.setString(4, cust.getPassword());
	    ps.setString(5, cust.getMobileno());
	    ps.setString(6, cust.getAlternateMobNo());
	    ps.setString(7, cust.getEmailId());
	    ps.setString(8, cust.getCountry());
	    ps.setString(9, cust.getState());
	    ps.setString(10, cust.getCity());
	    ps.setString(11, cust.getStreet());
	    ps.setString(12, cust.getPinCode());
	   	 row=ps.executeUpdate();
	   	dBConnection.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
		return row;
		}

    	@Override
	public boolean verify(String username, String passWord) throws SQLException  {
    		boolean flag = false;
    			String uname=" ", pwd="";
    			CustomerModel cm=new CustomerModel();
    			DBConnection db=new DBConnection();
    			PreparedStatement ps=db.getconnection().prepareStatement("Select username,password from customer where username =? ");
    			ps.setString(1, username);
    			ResultSet rs=ps.executeQuery();
			  while(rs.next()) { 
				  System.out.println("inside dao ");
				  uname=rs.getString("username");
			      pwd=rs.getString("passWord");
			  
			  } if(pwd.equals(passWord))
			  {
				  System.out.println("successful");
				 flag=true;
				  } 
			
			  else { System.out.println("enter the valid credentials"); } 			 
			  return flag;
	}

	@Override
	public boolean changeAddress(String username, CustomerModel customerModel) {
		
		try {
		CustomerModel cust=(CustomerModel)customerModel;
		DBConnection db=new DBConnection ();
		PreparedStatement ps=db.getconnection().prepareStatement("update customer set country=(?),state=(?),city=(?),street=(?) ,pincode=(?)where custId=(?)");
		ps.setString(1,cust.getCountry());
		ps.setString(2, cust.getState());
		ps.setString(3, cust.getCity());
		ps.setString(4, cust.getStreet());
		ps.setString(5,cust.getPinCode());
		ps.setString(6, username);
		int row = ps.executeUpdate();
		db.closeConnection();
		}catch(SQLException e1) {System.out.println(e1);}	
		return false;}

	@Override
	public boolean addtoCustomerGroup(int custId, int groupId) {
			
		
		return false;
	}

	@Override
	public CustomerModel getCustomerDetails() {
		 CustomerModel cust=new CustomerModel();
		List <CustomerModel> b=new LinkedList<>();
		try {
		   
			DBConnection db=new DBConnection();
			PreparedStatement ps=db.getconnection().prepareStatement("select * from customer ");
		    
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
	           String Username=rs.getString(1);
				String Fname=rs.getString(2);
				String Lname= rs.getString(3);
				String uname=rs.getString(4);
				String pwd=rs.getString(5);
				String mobno=rs.getString(6);
				String altno=rs.getString(7);
				String mail=rs.getString(8);
				String country=rs.getString(9);
				String state=rs.getString(10);
				String city=rs.getString(11);
				String street=rs.getString(12);
				
				String pincode=rs.getString(13);
				//cust.setCustId(custid);
				cust.setFirstname(Fname);
				cust.setLastname(Lname);
				cust.setUsername(uname);
				cust.setPassword(pwd);
				cust.setMobileno(mobno);
				cust.setAlternateMobNo(altno);
				cust.setEmailId(mail);
				cust.setCountry(country);
				cust.setState(state);
				cust.setCity(city);
				cust.setStreet(street);
				cust.setPinCode(pincode);
				b.add(cust);}
				db.closeConnection();
				
			}catch(SQLException e1) {System.out.println(e1);
			}
			
			return cust;	
	}
	@Override
	public String toString() {
		return "CustomerDaoImplementation [toString()=" + super.toString() + "]";
	}

	

	
	
	/*@Autowired
	CustomerDAO customerDaoImplementation;
	public void sample() {
		System.out.println("hiiiii");
		}*/
	
}

