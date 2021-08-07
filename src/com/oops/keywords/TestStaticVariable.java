package com.oops.keywords;
class Student
{  
	   int rollNumber;//instance variable  
	   String name;  //instance variable
	   static String college ="IET";//static variable  
	   //constructor  
	   Student(int r, String n)
	   {  
	   rollNumber = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display()
	      {
		   System.out.println(rollNumber+" "+name+" "+college);
		   }  
}  
	//Test class to show the values of objects  
public class TestStaticVariable
{  
 public static void main(String args[])
 {  
	 Student s1 = new Student(101,"Abhyudai");  
	 Student s2 = new Student(102,"Jayant");  
	 //we can change the college of all objects by the single line of code  
	 //Student.college="IIT";  
	 s1.display();  
	 s2.display();  
 }  
}  