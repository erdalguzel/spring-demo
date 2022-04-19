package com.erdal.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryList;

	public Student() {
		countryList = new LinkedHashMap<String, String>();
		countryList.put("BRA", "Brazil");
		countryList.put("AS", "Asgard");
		countryList.put("TR", "Turkey");
		countryList.put("GRE", "Greece");
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
