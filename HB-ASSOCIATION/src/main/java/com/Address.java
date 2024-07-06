package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address3")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int addId;
	String line1,line2,city,state;
	int pin;
	@OneToOne(targetEntity=Emp.class)
	public Address(){
		
	}
	public Address(String line1, String line2, String city, String state, int pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	

}
