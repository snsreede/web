package com.cg.webservice;

import java.util.Map;

import javax.jws.WebService;

import com.cg.dao.impl.EmployeeDaoInterface;
import com.cg.model.Employee;

@WebService(targetNamespace = "http://webservice.cg.com/", endpointInterface = "com.cg.webservice.EmployeeRestWebServiceIntfce", portName = "EmployeeRestWebServiceImplPort", serviceName = "EmployeeRestWebServiceImplService")
public class EmployeeRestWebServiceImpl implements EmployeeRestWebServiceIntfce {
	EmployeeDaoInterface employeeDaoImpl;
	EmployeeRestWebServiceIntfce employeeRestWebServiceImpl;
	

	@Override
	public Map<Integer, Employee> saveEmployee(int id, String name, float salary, String designation) {
		
		return employeeRestWebServiceImpl.saveEmployee(id, name, salary, designation);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRestWebServiceImpl.deleteEmployee(id);
		
	}

	@Override
	public void editEmployee(int id, String name, float salary, String designation) {
		employeeRestWebServiceImpl.editEmployee(id, name, salary, designation);
		
	}

	@Override
	public Map<Integer, Employee> fetchEmployee(int id, String name, float salary, String designation) {
		
		return employeeRestWebServiceImpl.fetchEmployee(id, name, salary, designation);
	}

	@Override
	public Map<Integer, Employee> showEmployee() {
		
		return employeeRestWebServiceImpl.showEmployee();
	}
	
	

}
