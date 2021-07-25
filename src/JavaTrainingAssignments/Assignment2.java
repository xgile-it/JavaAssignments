package JavaTrainingAssignments;

import java.util.Scanner;

public class Assignment2 {
	
		 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in); 
	     System.out.println("Enter a double number : ");
	     double number = scanner.nextDouble();
	     String doubleAsString = String.valueOf(number); //changing float value to string
	     int indexOfDecimal = doubleAsString.indexOf(".");  //values after decimal point
	     
	     System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
	     System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal+1));
	     
	     if(doubleAsString.substring(indexOfDecimal+1).equals(doubleAsString.substring(0, indexOfDecimal))) //equal or not
	     {
	         System.out.println("Equal");
		 }
		else
		{
		System.out.println("Not Equal");	
		}
	}
}

