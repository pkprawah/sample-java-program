package com.java;

public class Employee {

	private int id;
	private String name;
	private String designation;

	public Employee() {

	}

	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		boolean b = name.equals(other.name);
		System.out.println(b);
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))

			return true;
		return true;
	}

	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * System.out.println("equal method called"); if (!(obj instanceof
	 * Employee)) {
	 * 
	 * return false; } else {
	 * 
	 * Employee that = (Employee) obj; boolean b =
	 * this.name.equalsIgnoreCase(that.getName());
	 * System.out.println("Boolean V ::" + b); if (b == true) { return true; }
	 * else { return false; }
	 * 
	 * }
	 * 
	 * }
	 */

}