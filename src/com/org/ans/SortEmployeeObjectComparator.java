package com.org.ans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator{
	int id;
	String name;
	int age;

	public EmployeeComparator(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public EmployeeComparator() {
		
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
		return "EmployeeComparator [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
class TestComparator implements Comparator<EmployeeComparator>{
	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		
		return o1.getId() < o2.getId() ? -1 : o1.getId() > o2.getId() ? 1:0;
	}

}
public class SortEmployeeObjectComparator {

	public static void main(String[] args) {
		
		EmployeeComparator e1 = new EmployeeComparator(1, "prince", 5);
		EmployeeComparator e2 = new EmployeeComparator(2, "kuamr", 6);
		EmployeeComparator e3 = new EmployeeComparator(4, "prince", 2);
		EmployeeComparator e4 = new EmployeeComparator(3, "ankit", 1);
		EmployeeComparator e5 = new EmployeeComparator(5, "prince", 5);
		EmployeeComparator e6 = new EmployeeComparator(7, "rakesh", 8);
		EmployeeComparator e7 = new EmployeeComparator(6, "brince", 5);
		
		List<EmployeeComparator> list = new ArrayList<EmployeeComparator>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		System.out.println("Before : "+list);
		Collections.sort(list, new TestComparator());
		System.out.println("After :"+list);
	}

}
