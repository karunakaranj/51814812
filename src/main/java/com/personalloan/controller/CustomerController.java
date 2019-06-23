package com.personalloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalloan.model.CustomerEntity;
import com.personalloan.service.CustomerServiceImp;

@RestController
@RequestMapping
public class CustomerController {
	
	@Autowired
	CustomerServiceImp customerService;
	
	@PostMapping("/registration/customer")
	public CustomerEntity createCustomer(CustomerEntity customer) {
		return customerService.create(customer);
		
	}
	
	@DeleteMapping("/customer/delete")
	public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
		Object obj = customerService.delete(id);
		return new ResponseEntity<>(obj, HttpStatus.OK);
		
	}
	
	

}
