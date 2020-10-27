package com.org.ans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EmployeeList {
	private int id;
	private String name;
	private int age;

	public EmployeeList(int id, String name, int age) {
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
		return "EmployeeList [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class RemoveDuplicateNameEmployeeList {

	public static void main(String[] args) {
		EmployeeList e1 = new EmployeeList(1, "prince", 5);
		EmployeeList e2 = new EmployeeList(2, "kuamr", 6);
		EmployeeList e3 = new EmployeeList(4, "prince", 2);
		EmployeeList e4 = new EmployeeList(3, "ankit", 1);
		EmployeeList e5 = new EmployeeList(5, "prince", 5);
		EmployeeList e6 = new EmployeeList(7, "rakesh", 8);
		EmployeeList e7 = new EmployeeList(6, "brince", 5);
		
		List<EmployeeList> list = new ArrayList<EmployeeList>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.stream().forEach(System.out::println);
		
		//list.forEach(System.out::println);
		//list.sort((o1,o2)->o1.getId()<o2.getId() ? -1 : o1.getId()<o2.getId() ? 1 :0);
		list.sort((o1,o2)-> o2.getName().compareTo(o1.getName()));
		list.sort((e12,e21)->e12.getId()<e21.getId()?-1:e12.getId()>e21.getId()?1:0);
	//	Collections.sort(list, (e12,e21)->e1.getId()<e2.getId()?-1:e1.getId()>e2.getId()?1:0);
		System.out.println(list);
		//list.forEach(a->System.out.println(a));
		Map<String, EmployeeList> map = new HashMap<String, EmployeeList>();
		for(EmployeeList emp : list) {
			map.put(emp.getName(), emp);
		}
		
		System.out.println("collect : "+map);
		for(Map.Entry<String, EmployeeList> entry : map.entrySet()) {
			System.out.print(entry.getValue()+" , ");
		}
		
		int a=10;
		int b=20;
		
		b = (a+b)-(a=b);
		System.out.println("\na : "+a+" === b : "+b);
	}

	
}
