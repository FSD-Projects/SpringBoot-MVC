package com.example.demo.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	private EntityManager entityManager;

	public CustomerDaoImpl(EntityManager entityManager) {
		super();
		// TODO Auto-generated constructor stub
		this.entityManager = entityManager;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(customer);
		return customer;
	}
}
