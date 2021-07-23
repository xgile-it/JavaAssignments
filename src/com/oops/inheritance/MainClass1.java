package com.oops.inheritance;

public class MainClass1 {
public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 22;
		p1.name = "Abhay";
		
		Person p2 = new Person(25,"Ajay");
		//p2.age = 25;
		//p2.name = "Ajay";
		System.out.println("Name"+":::"+"Age");
		System.out.println(p1.name+"   "+p1.age);
		System.out.println(p2.name+"   "+p2.age);
		
		p1.eat();
		p2.walk();
		p2.walk(2);
		System.out.println("Count of person created = "+Person.count);
	}

}
class Person
{
	int age;
	String name;
	static int count;
	public Person() 
	{
		count++;
		System.out.println("Creating an object.");
	}
	/*
	 public Person(int newAge, String newName)
	{	
	this();
	name = newName;
	age = newAge;
	}	
	 */
	public Person(int age, String name)//Overloading
	{
		this(); //without this the value of count will be 1. 
		// With the help of THIS() you can call different constructors of the same class.
		//name = newName;
		//age = newAge;
		this.name = name;
		this.age = age;
		
	}
	
	class Developer extends Person
	{

		public Developer(int age, String name) {
			super(age, name);
			
		}
		
	}
	
	void walk() //Compile time polymorphism(Overloading)
	{
		System.out.println(name + " is walking.");
	}
	void eat()
	{
		System.out.println(name + " is eating.");
	}
	
	void walk(int steps) //Compile time polymorphism(Overloading)
	{
	System.out.println(name + " walked " + steps +" steps ");
	}	
}