package com.bytestree.service;

import com.bytestree.model.Employee;

public interface EmployeeService {

	Employee getEmployee(Long id);

	void addNewEmployee(Employee employee);
}
