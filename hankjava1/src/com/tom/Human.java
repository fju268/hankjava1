package com.tom;

public class Human {
	String variety;
	String name;
	int age;
	int iq;
	double DNA_similar;
	public Human(String variety, String name , int age , int iq , int DNA_similar) {
		this.variety = variety;
		this.name = name;
		this.age = age;
		this.iq = iq;
		this.DNA_similar = DNA_similar;
		
	}
	
	public void print() {
		System.out.print(variety + "\t" + name + "\t" + age + "\t" + iq + "\t" + DNA_similar);
	}
	
}
