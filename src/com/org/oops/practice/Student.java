package com.org.oops.practice;

import java.io.Serializable;

public class Student implements Serializable, Cloneable{

	private String name = "prince";
	private String college = "MCA";

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + "]";
	}

}
