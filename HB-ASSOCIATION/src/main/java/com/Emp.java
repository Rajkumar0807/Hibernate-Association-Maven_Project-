package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="epm3")
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	int empId;
	String name,email;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	Address addr;
	
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Address getAddr() {
		return addr;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
