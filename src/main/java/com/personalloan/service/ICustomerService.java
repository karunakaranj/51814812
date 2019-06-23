package com.personalloan.service;

import java.util.List;

import com.personalloan.model.CustomerEntity;

public interface ICustomerService {
	public CustomerEntity create(CustomerEntity customer);
	public CustomerEntity update(CustomerEntity customer);
	public String delete(Long id);
	public List<CustomerEntity> findAllEmployee();
	public CustomerEntity findbyid(Long id);
}
