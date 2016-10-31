package com.cg.dao.impl;

import java.util.HashMap;


import java.util.Map;

//import org.springframework.stereotype.Repository;

import com.cg.model.Employee;
//@Repository("employeeDaoImpl")
public class EmployeeDaoImpl {

private  Map<Integer,Employee> employeeList = new HashMap<Integer,Employee>();
	
	/*private  List<Emp> employeeList;
	private  List<Emp> employeeFetchList;
	private  List<Emp> showEmployeeList;
*/
	//@Autowired
  Employee employeeDTO;

	int x;
	public Map<Integer,Employee> saveEmployee(int id, String name, float salary, String designation) {
		employeeDTO = new Employee();
		employeeDTO.setId(id);
		employeeDTO.setName(name);
		employeeDTO.setSalary(salary);
		employeeDTO.setDesignation(designation);
		//employeeList = new ArrayList<Emp>();
		employeeList.put(id,employeeDTO);
		x++;
		System.out.println(x);
		return employeeList;
	}

	
	public void deleteEmployee(int id) {
		employeeList.remove(id);
		
		/*if(employeeList.get(employeeDTO).getId()==id){
			employeeList.remove(id);
		}
		*//*if (employeeDTO.getId() == id) {
			employeeDTO.setId(0);

		}
*/
	}

	
	public void editEmployee(int id, String name, float salary, String designation) {
		for(Map.Entry<Integer,Employee> entry:employeeList.entrySet()){
			if(entry.getKey().equals(id)){
				System.out.println("key is "+entry.getKey());
				
				System.out.println("value is"+entry.getValue().getId()+entry.getValue().getName()+entry.getValue().getSalary()+entry.getValue().getDesignation());
				entry.getValue().setId(id);
				entry.getValue().setName(name);
				entry.getValue().setDesignation(designation);
				entry.getValue().setSalary(salary);
				//employeeList.replace(id, employeeDTO);
				//employeeList.put(entry.getKey(), entry.setValue(employeeDTO));
			}
			else{
				System.out.println("all keys  "+entry.getKey());
			}
		}
		/*if(employeeList.get(employeeDTO).getId()==id){
			employeeDTO.setId(id);
			employeeDTO.setName(name);
			employeeDTO.setSalary(salary);
			employeeDTO.setDesignation(designation);
			employeeList.replace(id, employeeDTO);
		}*/
		/*if (employeeDTO.getId() == id) {
			employeeDTO.setId(id);
			employeeDTO.setName(name);
			employeeDTO.setSalary(salary);
			employeeDTO.setDesignation(designation);

		}*/

	}


	public Map<Integer,Employee> fetchEmployee(int id) {
		Map<Integer,Employee> employeeFetchList = new HashMap<Integer,Employee>();
		for(Map.Entry<Integer, Employee> entry:employeeList.entrySet()){
			if(entry.getKey()== id){
				
				employeeFetchList.put(id, entry.getValue());
				return employeeFetchList;
			}
			
		}
		return employeeFetchList;	
		
		/*employeeFetchList = new ArrayList<Emp>();*/
		/*if (employeeList.get(employeeDTO).getId()==id) {
			employeeFetchList.put(id,employeeDTO);
			return employeeFetchList;
		}*/
		
	}


	public Map<Integer,Employee> showEmployee() {
		/*showEmployeeList = new ArrayList<Emp>();*/
		
		 
		
			return employeeList;
		
	}

	
}
