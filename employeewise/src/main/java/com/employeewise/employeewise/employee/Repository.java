package com.employeewise.employeewise.employee;

import java.util.List;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Employee, UUID> {
	
}
