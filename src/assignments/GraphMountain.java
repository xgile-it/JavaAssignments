package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphMountain {
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
        
        //the logic for the highest and lowest numbers of the array
        int high,low,i;
        int n = array.length;
        high = low = array[0];
        for(i=1; i<n; ++i)
        {
        if(array[i] > high)
        high = array[i];

        if(array[i] < low)
        low = array[i];
        }
        
        //Printing the highest peak and the lowest valley
        System.out.print("\n The highest peak is: " + high + "\n");
        System.out.print("\n The lowest valley is: "+ low + "\n");
        
        int difference = high-low;
        //printing the difference of the highest and the lowest elements of the array
        System.out.print("\n The difference between the highest peak and the lowest valley: "+ difference + "\n");
        
        int table = 0;
        for( int k = 0; k < arrayLength-1; k++) {
        if (array[k] == array[k+1]){
        	table++;     
        }
       }
       if (table>0) {
    	   System.out.println("\nTable exists");
       }
       else {
    	   System.out.println("\nTable doesn't exists");
       }
       List<Integer> list = new ArrayList<Integer>();
       for(Integer text : array) {
          list.add(text);
       }
       System.out.println("\n List of the elements of the array: "+list);
      
    }
}
