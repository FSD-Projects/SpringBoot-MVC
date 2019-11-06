package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;

	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		// TODO Auto-generated constructor stub
		this.customerDao = customerDao;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.saveCustomer(customer);
	}
	
}
