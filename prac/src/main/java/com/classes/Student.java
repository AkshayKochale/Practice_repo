package com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component("s2")
public class Student 
{

	@Id
	private Integer stuId;
	
//	@Column(name="name")
	@Value("#{new com.classes.Student().getName()}")
	 String name;
	
//	@Autowired
//	@Qualifier("alok")
	@OneToOne
	private Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer stuId, String name, Address address) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		
		return "mc";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
