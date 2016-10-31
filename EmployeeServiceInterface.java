package com.cg.service.intrface;

import java.util.Map;

import com.cg.model.Employee;

public interface EmployeeServiceInterface {
	public Map<Integer,Employee> saveEmployee(int id, String name, float salary, String designation);

	public void deleteEmployee(int id);

	public void editEmployee(int id, String name, float salary, String designation);

	public Map<Integer,Employee> fetchEmployee(int id);

	public Map<Integer,Employee> showEmployee();

	
}
