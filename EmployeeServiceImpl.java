package com.cg.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.cg.dao.impl.EmployeeDaoInterface;
import com.cg.model.Employee;
import com.cg.service.intrface.EmployeeServiceInterface;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeServiceInterface {
	
	EmployeeDaoInterface employeeDaoImpl;
	public Map<Integer,Employee> saveEmployee(int id, String name, float salary, String designation)
	{
		return employeeDaoImpl.saveEmployee(id, name, salary, designation);
	}

	public void deleteEmployee(int id)
	{
		employeeDaoImpl.deleteEmployee(id);
	}

	public void editEmployee(int id, String name, float salary, String designation)
	{
		employeeDaoImpl.editEmployee(id, name, salary, designation);
	}

	public Map<Integer,Employee> fetchEmployee(int id)
	{
	 return employeeDaoImpl.fetchEmployee(id)	;
	}

	public Map<Integer,Employee> showEmployee()
	{
		return employeeDaoImpl.showEmployee();
	}

	
	

}
