package com.org.oops.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HowManyWayToCreateClassObject {
//there are five way to create the class object.
	/**
	 * 1.	through new keyword
	 * 2.	newInstance() of Class class
	 * 3.	newInstance() of constructor class
	 * 4.	using object deserilization
	 * 5.	using clone method of object class
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, IOException {
		
		//2.	newInstance() of Class class
		Class cls = Class.forName("com.org.oops.practice.Student");

		Student s1 = (Student) cls.newInstance();
		
		System.out.println("newInstance() of Class class ==> "+s1.getName()+" ==== "+s1.getCollege());
		
		//3.	newInstance() of constructor class
		Constructor < Student > constructor = Student.class.getConstructor();
            Student s2 = constructor.newInstance();
		
            System.out.println("newInstance() of Constructor class ==> "+s2.getName()+" ==== "+s2.getCollege());
		//4.	using object deserilization
            
            FileOutputStream fos = new FileOutputStream("abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            
            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s3 = (Student)ois.readObject();
            System.out.println("using descrilization ==> "+s3.getName()+" ==== "+s3.getCollege());
            
        //5.	using clone method of object class
            Student s5 = new Student();
	}

}
