package com.personalloan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.personalloan.model.CustomerEntity;
import com.personalloan.repo.ICustomerRepository;
@Service
public class CustomerServiceImp implements ICustomerService{

	@Autowired
	private ICustomerRepository customerRepo;
	@Override
	public CustomerEntity create(CustomerEntity customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public CustomerEntity update(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Long id) {
		Optional<CustomerEntity> customer = customerRepo.findById(id);
		String response = null;
		if (customer.isPresent()) {
			CustomerEntity c = customer.get();
			customerRepo.delete(c);

			response = "deleted successfully";
		} else {
			response = "doesnt exit";
		}
		return response;
		
	}

	@Override
	public List<CustomerEntity> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity findbyid(Long id) {
		Optional<CustomerEntity> cust = customerRepo.findById(id);
		CustomerEntity customer = new CustomerEntity();
		if (cust.isPresent()) {
			CustomerEntity customer1 = cust.get();
			customer.setName(customer1.getName());
			customer.setMobileNo(customer1.getMobileNo());
			customer.setDOB(customer1.getDOB());
			customer.setExpense(customer1.getExpense());
			customer.setMaritalStatus(customer1.getMaritalStatus());
	
		
		}
		return customer;
		}
}

