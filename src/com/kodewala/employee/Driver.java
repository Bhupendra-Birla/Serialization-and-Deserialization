package com.kodewala.employee;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		EmployeeSerialization employeeSerialization = new EmployeeSerialization();
		
		Employee employee1 = new Employee(101, "Bhupendra", 70000.0, "IT", "Bhupu@622999");


		employeeSerialization.employeeData(employee1);
	}

}
