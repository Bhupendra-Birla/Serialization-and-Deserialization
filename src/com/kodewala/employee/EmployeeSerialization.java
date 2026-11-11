package com.kodewala.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	private static final long serialVersionUID =1L;
	
	public void employeeData(Employee employee) throws IOException {
//		Employee employee1 = new Employee(101, "Bhupendra", 70000.0, "IT", "Bhupu@622999");
		//create file and where we save the data
		FileOutputStream fos = new FileOutputStream("empdata.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employee);
		oos.close();
	}
}
