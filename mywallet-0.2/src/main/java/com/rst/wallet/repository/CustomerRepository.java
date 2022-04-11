package com.rst.wallet.repository;

import org.springframework.stereotype.Repository;

import com.rst.wallet.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
