package com.dolphine.customer.resource;

import com.dolphine.customer.model.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerResource {

	private String id;
	
	private String name;
	
	public CustomerResource(){
		
	}
	
	public CustomerResource(Customer customer){
		this.id=customer.getId();
		this.name=customer.getName();
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
		
}
