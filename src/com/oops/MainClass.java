package com.oops;

public class MainClass {

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
		System.out.println("Count = "+Person.count);
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
	
	public Person(int age, String name) 
	{
		this(); //without this the value of count will be 1.
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
	
	void walk()
	{
		System.out.println(name + " is walking.");
	}
	void eat()
	{
		System.out.println(name + " is eating.");
	}
	
	void walk(int steps) //polymorphism
	{
	System.out.println(name + " walked " + steps +" steps ");
	}
	
	
	
	
}