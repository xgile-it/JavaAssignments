package com.oops.keywords;
class Students{  
    int rollNumber;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "IET";  
    }  
    //constructor to initialize the variable  
    Students(int r, String n){  
    rollNumber = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollNumber+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
public class TestStaticMethod{  
   public static void main(String args[]){  
	  Students.change();//calling change method  
   //creating objects  
   Student s1 = new Student(111,"Karan");  
   Student s2 = new Student(222,"Aryan");  
   Student s3 = new Student(333,"Sonoo");  
   //calling display method  
   s1.display();  
   s2.display();  
   s3.display();  
   }  
}  