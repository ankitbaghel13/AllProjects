package cxfrestservice.dao;

import cxfrestservice.model.Employee;

public class EmployeeDao {

	public Employee getEmployeeDetails(String employeeId){
		
		Employee emp = new Employee();
		
		emp.setEmpId(employeeId);
		emp.setFirstName("Ankit");
		emp.setLastName("baghel");
		emp.setEmail("ankitbaghel13@gmail.com");
		emp.setDepartment("ADM");
		emp.setDateOfJoining("13-Feb-2014");
		
		return emp;
	}
}
