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

package com.dolphine.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dolphine.customer.model.Customer;
import com.dolphine.customer.resource.CustomerResource;
import com.dolphine.customer.service.CustomerService;

@RestController
@RequestMapping(CustomerController.RESOURCE)
public class CustomerController {

	public static final String RESOURCE = "/customer";

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = { RequestMethod.GET })
	public List<CustomerResource> list() {
		return null;
	}

	@RequestMapping(method = { RequestMethod.POST })
	public CustomerResource post(@RequestBody CustomerResource customer) {
		Customer savedCustomer = customerService.save(new Customer(null,
				customer.getName()));
		return new CustomerResource(savedCustomer);
	}

	@RequestMapping(method = { RequestMethod.GET }, value = "/{id}")
	public CustomerResource get(@PathVariable("id") String id) {
		return new CustomerResource(customerService.find(id));
	}

	@RequestMapping(method = { RequestMethod.PUT }, value = "/{id}")
	public CustomerResource put(@PathVariable("id") String id,
			@RequestBody CustomerResource resource) {
		return null;
	}

	@RequestMapping(method = { RequestMethod.DELETE }, value = "/{id}")
	public void delete(@PathVariable("id") String id) {
		return;
	}
}
