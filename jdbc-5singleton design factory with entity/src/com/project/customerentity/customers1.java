package com.project.customerentity;

public class customers1 {
	private int slno;
	private String name;
	private String gender;
	private int age;
	private int salary;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public customers1() {
		super();
		this.slno = slno;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "costomers [slno=" + slno + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary="
				+ salary + "]";
	}

}
