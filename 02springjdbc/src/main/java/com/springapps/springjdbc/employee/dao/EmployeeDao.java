package com.springapps.springjdbc.employee.dao;

import com.springapps.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee employee);
	
	int update(Employee employee);
//	
int delete(Employee employee);

	
	//"update employee set firstname=?,lastname=?where id=?"
	//"delete from employee where id=?"
	
}