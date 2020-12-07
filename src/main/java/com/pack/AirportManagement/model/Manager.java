package com.pack.AirportManagement.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "manager")
public class Manager {
	@Id
	private long managerId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String contactNumber;
	public Manager(String firstName, String lastName, int age, String gender, String contactNumber, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.password = password;
	}
	public Manager(long managerId, String firstName, String lastName, int age, String gender, String contactNumber,
			String password) {
		super();
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.password = password;
	}
	private String password;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", contactNumber=" + contactNumber + ", password=" + password + "]";
	}
	
	
	
}
