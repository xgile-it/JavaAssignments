package study;

import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text here:");
		String str = sc.nextLine();
		 String words[]=str.split("\\s"); //splits the string based on whitespace
	        String capitalizeStr="";
	      //using for loop to print each elements of string array
	        for(String word:words){
	            String firstLetter=word.substring(0,1);  //0 is starting point and 1 is the end point.
	            String remainingLetters=word.substring(1); //prints the remaining letters leaving the 1st letter.
	            capitalizeStr=capitalizeStr+firstLetter.toUpperCase()+remainingLetters+" ";
	        }
	        System.out.println(capitalizeStr);
		
	}

}
