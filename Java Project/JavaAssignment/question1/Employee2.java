package com.JavaAssignment.question1;

import java.io.Serializable;

public class Employee2 implements Serializable{
	  
	private static final long serialVersionUID = 7451014140912304861L;
	String EmployeeId;
	  String EmployeeName; 
	  String EmployeePhone; 
	  String EmployeeAddress;
	  int EmployeeSalary;
	public Employee2(String employeeId, String employeeName, String employeePhone, String employeeAddress,
			int employeeSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeePhone = employeePhone;
		EmployeeAddress = employeeAddress;
		EmployeeSalary = employeeSalary;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeePhone() {
		return EmployeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		EmployeePhone = employeePhone;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeePhone="
				+ EmployeePhone + ", EmployeeAddress=" + EmployeeAddress + ", EmployeeSalary=" + EmployeeSalary + "]";
	}
	  

}
