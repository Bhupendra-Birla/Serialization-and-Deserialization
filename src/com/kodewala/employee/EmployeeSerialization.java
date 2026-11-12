package com.kodewala.employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kodewala.smsmessage.SMS;

public class EmployeeSerialization {

	
	
	public void employeeData() throws IOException, ClassNotFoundException {
//		Employee employee1 = new Employee(101, "Bhupendra", 70000.0, "IT", "Bhupu@622999");
		//create file and read the object data.
		FileInputStream fis = new FileInputStream("E:\\KW Java Backend Course\\Serialization\\empdata.ser");
		// converts stream of bytes into object
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		read the data 
	  Employee employee2 =  (Employee)ois.readObject();
	  System.out.println(employee2.eName);
	  System.out.println(employee2.eDepartment);
	  System.out.println(employee2.ePassword);  // sensitive data 
	  System.out.println(employee2.eSalary); //sensitive data
	  ois.close();
	}
}
