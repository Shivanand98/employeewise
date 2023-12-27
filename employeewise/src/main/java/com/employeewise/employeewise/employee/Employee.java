package com.employeewise.employeewise.employee;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Emoployees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String ename;
	private Long phone_no;
	private String email;
	private String reportsTo;
	private String profile;
	

	
	public Employee(UUID id, String ename, Long phone_no, String email, String reportsTo, String profile) {
		super();
		this.id = id;
		this.ename = ename;
		this.phone_no = phone_no;
		this.email = email;
		this.reportsTo = reportsTo;
		this.profile = profile;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", phone_no=" + phone_no + ", email=" + email
				+ ", reportsTo=" + reportsTo + ", profile=" + profile + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
