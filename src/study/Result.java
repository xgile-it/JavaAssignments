package study;
import java.util.Scanner;

public class Result {
	
	
	    public static void main(String args[]){
	    	String txt = "Welcome to the result calculator!!!";
	    	System.out.println(txt);
	        
	    System.out.println("Enter Subject Marks For Checking The Result");
	    
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Marks of first subject:");
	    float a1 = scanner.nextFloat();
	    System.out.println("Marks of second subject:");
	    float a2 = scanner.nextFloat();
	    System.out.println("Marks of third subject:");
	    float a3 = scanner.nextFloat();
	    System.out.println("Marks of fourth subject:");
	    float a4 = scanner.nextFloat();
	    System.out.println("Marks of fifth subject:");
	    float a5 = scanner.nextFloat();
	    
	     float sum = a1 + a2 + a3 + a4 + a5;
	     float total = (sum/500)*100;
	     System.out.println(sum);
	     System.out.println(total);

	    }
	}

