package study;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text here:");
		String str = sc.nextLine();
		str = str.toLowerCase();
		System.out.println("Character \t Frequency");
		for(char ch='a' ; ch<='z' ; ch++) 
		{
			int c = 0;
			for (int i=0; i<str.length(); i++) {
			if(ch==str.charAt(i))
				c++;
			
		}
		if (c!=0)
			System.out.println(ch+"\t\t"+c);
		}

	}
}