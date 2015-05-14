package com.dolphine.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dolphine.customer.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
