package com.personalloan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalloan.model.CustomerEntity;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
