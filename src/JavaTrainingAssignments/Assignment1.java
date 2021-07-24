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
        	 int countOfLeapYears = (differenceBetweenYears/4)-1;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 200 && differenceBetweenYears < 300) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-2;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 300 && differenceBetweenYears < 400) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-3;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears == 400 ) {
        	 int countOfLeapYears = (differenceBetweenYears/400)-3;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears > 400 && differenceBetweenYears < 500) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-3;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 500 && differenceBetweenYears < 600) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-4;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 600 && differenceBetweenYears < 700) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-5;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 700 && differenceBetweenYears < 800) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-6;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears == 800 ) {
        	 int countOfLeapYears = (differenceBetweenYears/400)-6;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears > 800 && differenceBetweenYears < 900) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-6;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else if (differenceBetweenYears >= 900 && differenceBetweenYears < 1000) {
        	 int countOfLeapYears = (differenceBetweenYears/4)-7;
        	 System.out.println("You have been alive for: "+differenceBetweenYears+" years");
        	 System.out.println("You have experienced: "+countOfLeapYears+" leap years");
        	 System.out.println("You have been alive for: "+(differenceBetweenYears*365 + countOfLeapYears )+" days");
         }
         else {
        	 System.out.println("Invalid Request: Enter the correct birth year");
         }
    }
 
}
