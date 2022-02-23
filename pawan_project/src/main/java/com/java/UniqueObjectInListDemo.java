package com.java;

import java.util.ArrayList;
import java.util.List;

public class UniqueObjectInListDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "pawan", "SSE");
		Employee e2 = new Employee(2, "saroj", "SSE");

		Employee e3 = new Employee(3, "avnish", "SSE");
		Employee e4 = new Employee(4, "nitesh", "SSE");
		Employee e5 = new Employee(5, "pawan", "SSE");
		Employee e6 = new Employee(6, "gaurav", "SSE");
		Employee e7 = new Employee(7, "gaurav", "SSE");
		Employee e8 = new Employee(8, "nitesh", "SSE");

		List<Employee> employeeList = new ArrayList<Employee>();
		List<Employee> empList = new ArrayList<Employee>();

		employeeList.add(e1);
		employeeList.add(e2);

		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		employeeList.add(e7);
		employeeList.add(e8);

		System.out.println("List object is :: " + employeeList);

		for (Employee emp : employeeList) {
			boolean b = employeeList.contains(emp);
			System.out.println("Boolean value  object is :: " + b);
			if (employeeList.contains(emp.getName())) {
				continue;
			} else {
				empList.add(emp);
			}
		}

		System.out.println("Unique  object is :: " + empList);

	}

}
