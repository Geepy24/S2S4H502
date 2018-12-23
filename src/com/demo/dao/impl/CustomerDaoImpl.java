package com.demo.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.demo.dao.ICustomerDao;
import com.demo.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao{

	@Override
	public List<Customer> findAllCustomer() {
	
		return (List<Customer>) getHibernateTemplate().find("from Customer") ;
	}

	@Override
	public void saveCustomer(Customer customer) {
		System.out.println(customer);
		System.out.println("hibernateTemplate = "+getHibernateTemplate());
		getHibernateTemplate().save(customer);
		
	}

	
	
	
}
