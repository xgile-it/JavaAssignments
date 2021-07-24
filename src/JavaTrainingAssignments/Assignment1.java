package JavaTrainingAssignments;
import java.time.LocalDate;
import java.util.Scanner;
public class Assignment1 {
    
    public static void main(String[] args){
    	 int birthYear;
    	 Scanner input = new Scanner(System.in);
         System.out.println("Enter your birth year:");

         birthYear = input.nextInt();
         int currentYear = LocalDate.now().getYear();
         int differenceBetweenYears = currentYear - birthYear;
         
		if(differenceBetweenYears < 100) {
        	 int countOfLeapYears = (differenceBetweenYears/4);
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 100 && differenceBetweenYears < 200) {
        	 int countOfLeapYears = (differenceBetweenYears/4);
        	 countOfLeapYears = countOfLeapYears-1;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 200 && differenceBetweenYears < 300) {
        	 int countOfLeapYears = (differenceBetweenYears/4);
        	 countOfLeapYears = countOfLeapYears-2;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 300 && differenceBetweenYears < 400) {
        	 int countOfLeapYears = (differenceBetweenYears/4);
        	 countOfLeapYears = countOfLeapYears-3;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears == 400 ) {
        	 int countOfLeapYears = (differenceBetweenYears/400);
        	 countOfLeapYears = countOfLeapYears-3;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
       
    }
 
}
