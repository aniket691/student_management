package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private String id;
	private String name;

	private String age;

	private String address;

	private String department;

	private String college_name;

	public Student() {
	}

	public Student(String id, String name, String age, String address, String department, String college_name) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
		this.college_name = college_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCollege_name() {
		return college_name;
	}

	//set college name
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
}
