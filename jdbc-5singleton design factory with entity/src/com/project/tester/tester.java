package com.project.tester;

import com.project.customerentity.customers1;
import com.project.demo.details;

public class tester {
	public static void main(String[]args) {
		//customers1 customer=new customers1(18, "mano", "m", 28, 30000);
		details details=new details();
		customers1 customers=new customers1();
		//customers.setSlno(6);
		//customers.setGender("m");
		//details.updategender(customers);
	//	details.savedata(customer);
		customers.setSlno(1);
		customers.setName("sridhar");
		customers.setGender("M");
		customers.setAge(26);
		customers.setSalary(40000);
		details.updatealldata(customers);
		customers.setSlno(1);
	//	details.deletedata(customers);
		
	}

}
