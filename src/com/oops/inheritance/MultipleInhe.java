package com.oops.inheritance;

class First
{  
	void msg()
	{
	System.out.println("Hello");
	}  
}  
class Second
{  
	void msg()
	{
	System.out.println("Welcome");
	}  
}  
//class MultipleInhe extends First, Second
class MultipleInhe extends Second
{  
   
 public static void main(String args[])
 {  
	 MultipleInhe obj=new MultipleInhe();  
	 obj.msg();  
 }  
}  