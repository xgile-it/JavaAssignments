package com.oops;

public class Management {

	public static void main(String[] args) {
		Dog pomerian = new Dog() ;
		pomerian.eat();

	}

}
class Animal{  
void eat()
	{
	System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
void eat()
	{
	System.out.println("eating bread...");
	}  
}