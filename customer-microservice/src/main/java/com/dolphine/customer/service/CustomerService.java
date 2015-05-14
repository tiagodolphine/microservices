/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dolphine.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dolphine.customer.model.Customer;
import com.dolphine.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private ServiceProperties configuration;

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer save(Customer customer){
		return customerRepository.save(customer);
	}
	
	public Customer find(String id){
		return customerRepository.findOne(id);
	}
	
	public List<Customer> list(){
		return customerRepository.findAll();
	}
	
	public void delete(String id){
		customerRepository.delete(id);
	}
}
