package com.rst.wallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rst.wallet.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
