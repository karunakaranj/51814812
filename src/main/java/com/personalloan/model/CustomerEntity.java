package com.personalloan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="/CustomerDetails")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column(name="/CustName")
	private String name;
	@Column(name="/MobileNo")
	private int MobileNo;
	@Column(name="/DoB")
	private Date DOB;
	@Column(name="/Gender")
	private String Gender;
	@Column(name="/MaritalStatus")
	private String MaritalStatus;
	@Column(name="/CreditScore")
	private double CreditScore;
	@Column(name="/Salary")
	private Long Salary;
	@Column(name="/expense")
	private Long expense;
	
	public CustomerEntity() {

	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}

	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public Long getExpense() {
		return expense;
	}

	public void setExpense(Long expense) {
		this.expense = expense;
	}


}
