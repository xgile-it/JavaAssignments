package assignments;

import java.util.Scanner;

public class GraphStockMarket {
public static void main(String[] args) {
		
		//taking input of the length from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your array ");
        int arrayLength = scanner.nextInt();
        
        //initializing the array by the length given by the user
        int array [] = new int[arrayLength];
        
      //taking input of the elements of the array from the user
        System.out.println("Enter the values of your array ");
        for (int values =0 ; values < array.length; values++)
        {
        	array[values] = scanner.nextInt();
        }   
        
      //the logic for the rise and fall in the array
        int rises = 0;
        int falls = 0;
        for (int k= 1; k < arrayLength-1; k++){
            if (array[k] > array[k+1]){
                rises++;
            }
            else if (array[k] < array[k+1]){
                falls++;
            }
        }
        System.out.println("No. of rises: "+ rises);
        System.out.println("No. of falls: "+ falls);
        
	}
}
