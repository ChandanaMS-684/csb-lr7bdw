package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerModel {

	private int custId;
	private String firstname; 
	private String lastname; 
	private String password;
	private String username;
	private String mobileno;
	private String alternateMobNo;
	private String emailId;
	private String country;
	private String state;
	private String city;
	private String street;
	private String pinCode;
	public int getCustId() {
		return custId;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAlternateMobNo() {
		return alternateMobNo;
	}

	public void setAlternateMobNo(String alternateMobNo) {
		this.alternateMobNo = alternateMobNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "CustomerModel [firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", username=" + username + ", mobileno=" + mobileno + ", alternateMobNo=" + alternateMobNo
				+ ", emailId=" + emailId + ", country=" + country + ", state=" + state + ", city=" + city + ", street="
				+ street + ", pinCode=" + pinCode + "]";
	}
}
