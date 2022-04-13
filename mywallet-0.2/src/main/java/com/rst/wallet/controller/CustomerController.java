package com.rst.wallet.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rst.wallet.model.Customer;
import com.rst.wallet.repository.CustomerRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CustomerController{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//@Autowired(required=true)
	//private CustomerDAO customerDao;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Security Wallet App";
	}
	
	@GetMapping(value = "/customer", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomer(){
		
		return customerRepository.findAll();
	}
	
	@PostMapping(value = "/customers", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomer(@RequestBody Customer cust) {
		logger.info("Customer Data Posting,{}" + cust);
		//Customer c = new Customer(null, null, null, null, 9511284371, null, null, null)
		
		return customerRepository.insert(cust);
	}	
	

}
