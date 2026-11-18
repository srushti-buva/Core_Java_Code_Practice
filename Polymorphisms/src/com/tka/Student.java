package com.tka;

public class Student {
	int id;
	String name;
	Student(){
		id = 0;
		name = "Unknown";
	}
	Student(int id){
		this.id=id;
	}
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}

}
