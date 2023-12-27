package com.employeewise.employeewise.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	private Repository repository;
	
	public Employee addEmployee(Employee employee) {
		employee.setId(UUID.randomUUID());
		return repository.save(employee);
	}

	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	public void deleteEmployee(UUID id) {
		repository.deleteById(id);
	}
	
	public Employee updateEmployee(UUID id, Employee updatedEmployee) {
		Employee existEmp=repository.findById(id).orElse(null);
		if(existEmp != null) {
			existEmp.setEname(updatedEmployee.getEname());
			existEmp.setPhone_no(updatedEmployee.getPhone_no());
			existEmp.setEmail(updatedEmployee.getEmail());
			existEmp.setReportsTo(updatedEmployee.getReportsTo());
			existEmp.setProfile(updatedEmployee.getProfile());
			return repository.save(existEmp);
		}
		else {
			return null;
		}
	}
}
