package JavaTrainingAssignments;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		String string;  
		Scanner scanner  = new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		string =scanner.nextLine();                    //reading string from user  
		System.out.print("After reverse string is: ");  
		for(int i = string.length(); i>0; --i)                //i is the length of the string  
		{  
		System.out.print(string.charAt(i-1));            //printing the character at index i-1  
		}  

	}

}
