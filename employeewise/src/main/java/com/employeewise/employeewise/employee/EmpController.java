package com.employeewise.employeewise.employee;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee addEmployee=service.addEmployee(employee);
		return new ResponseEntity<>(addEmployee,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable String ename){
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updatedEmployee(@PathVariable UUID id,@RequestBody Employee updatedEmployee ){
		Employee employee=service.updateEmployee(id, updatedEmployee);
		if(employee!=null) {
			return new ResponseEntity<>(employee, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
}
