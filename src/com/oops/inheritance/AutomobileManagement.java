package com.oops.inheritance;
class Vehicle
{
	int numberofWheels;
	Long mileage;
	public void move() 
	{
		System.out.println("Move in Vehicle class");
	}
}
class Car extends Vehicle
	{
		@Override 
		public void move() 
		{
			System.out.println("Move in Car class");
		}
	}
class Bike extends Vehicle
		{
			@Override 
			public void move() 
			{
				System.out.println("Move in Bike class");
			}
		}
public class AutomobileManagement 
{

	public static void main(String[] args) 
	{
		Car mercedes = new Car();
		Car bmw = new Car();
		mercedes.numberofWheels = 4;
		Bike r1= new Bike();
		Bike ducati= new Bike();
		r1.numberofWheels = 2;
		ducati.numberofWheels = 2;
		bmw.move();
		ducati.move();
	}
}
