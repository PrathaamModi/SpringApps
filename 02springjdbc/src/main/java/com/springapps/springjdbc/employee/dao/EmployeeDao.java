package com.springapps.springjdbc.employee.dao;

import java.util.List;

import com.springapps.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

	int create(Employee employee);

	int update(Employee employee);

	int delete(Employee employee);

	Employee read(int id);

	List<Employee> read();

	// "update employee set firstname=?,lastname=?where id=?"
	// "delete from employee where id=?"

}