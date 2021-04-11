package com.algo.initial;
import java.util.Arrays;
import java.util.Collections;

public class Array1 {

	int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[][]= {{1,3,4},{2,4}};
		 
		 int acc[][]=arr.clone();
		 
		 System.out.println(arr);
		 System.out.println(acc);
		 
		 System.out.println(arr[0]);
		 System.out.println(acc[0]);
		 
	}
}




class Student{
	
	int age;
	String name;
	
	public Student() {
		System.out.println("student");
	}
	public Student(int age, String name) {
		super();
		System.out.println("studentage");
		this.age = age;
		this.name = name;
	}
	
	
}