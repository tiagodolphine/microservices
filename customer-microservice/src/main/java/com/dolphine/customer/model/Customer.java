package com.dolphine.customer.model;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	private String id;
	
	private String name;
	
	private String age;
	
	private String email;

	public Customer(){
				
	}
	
	public Customer(String id, String name){
		this.name=name;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
