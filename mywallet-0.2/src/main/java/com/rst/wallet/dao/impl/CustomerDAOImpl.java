/*
 * package com.rst.wallet.dao.impl;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.rst.wallet.dao.CustomerDAO; import com.rst.wallet.model.Customer;
 * import com.rst.wallet.repository.CustomerRepository;
 * 
 * public class CustomerDAOImpl implements CustomerDAO{
 * 
 * @Autowired CustomerRepository customerRepository;
 * 
 * @Override
 * 
 * @Transactional public List<Customer> getCustomers() { return
 * customerRepository.findAll(); }
 * 
 * @Override public Customer saveCustomer(Customer cust) { // TODO
 * Auto-generated method stub return customerRepository.save(cust); }
 * 
 * }
 */