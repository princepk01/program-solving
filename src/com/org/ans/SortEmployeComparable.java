package com.org.ans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author DEVELOPER
 *
 */
class Employee implements Comparable<Employee>{
	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
	
		//return this.id-o.id; it will return based on id ascending order
		//return o.id-this.id; it will return based on id descending order
		//return this.name.compareTo(o.name); it will return based on name ascending order
		return o.name.compareTo(this.name);//it will return based on name descending order
	}

}

public class SortEmployeComparable {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "prince", 5);
		Employee e2 = new Employee(2, "kuamr", 6);
		Employee e3 = new Employee(4, "prince", 2);
		Employee e4 = new Employee(3, "ankit", 1);
		Employee e5 = new Employee(5, "prince", 5);
		Employee e6 = new Employee(7, "rakesh", 8);
		Employee e7 = new Employee(6, "brince", 5);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
