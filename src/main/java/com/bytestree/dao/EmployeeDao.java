package com.bytestree.dao;

import java.io.Serializable;

import com.bytestree.model.Employee;

public interface EmployeeDao {

	Serializable save(Employee employee);

	Employee findById(Serializable id);

}
