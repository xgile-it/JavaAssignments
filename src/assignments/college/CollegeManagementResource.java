package assignments.college;
import java.util.Scanner;

public class CollegeManagementResource {

	public static void main(String[] args) {
		try {
			StudentRepository studentRepositoryObject = new StudentRepository();
			studentRepositoryObject.addNewStudent(new Student(1,"Abhyudai","Singh",'A'));
			studentRepositoryObject.addNewStudent(new Student(2,"Aditya","Singh",'B'));
			studentRepositoryObject.addNewStudent(new Student(3,"Tushar","Singh",'C'));
			studentRepositoryObject.addNewStudent(new Student(4,"Abhijeet","Singh",'B'));
			studentRepositoryObject.addNewStudent(new Student(5,"Vishal","Singh",'A'));
			studentRepositoryObject.addNewStudent(new Student(6,"Tebogo","Assagai",'B'));
			studentRepositoryObject.addNewStudent(new Student(7,"Godwin","Tanaka",'D'));
			studentRepositoryObject.addNewStudent(new Student(8,"Samuel","Komane",'C'));
			studentRepositoryObject.addNewStudent(new Student(9,"Ram","Rai",'C'));
			studentRepositoryObject.addNewStudent(new Student(10,"Kajal","Saxena",'C'));
			System.out.println("\n================================WELCOME!=================================");
			
			int choice;
			Scanner scanner = new Scanner(System.in);
			
			do {
				System.out.println("Select an option\n0-Exit\n1-Find All\n2-Delete\n3-Add student\n4-Find Grade For Student\n5-Print Students By Grade");
				choice = scanner.nextInt();
				
			switch(choice)
		 	{
			case 0:
				System.out.println("Successfully exited.");
				break;
				
		 	 case 1:
		 		System.out.println( studentRepositoryObject.findAllStudents()+"\n=======================");
				break;
			 
		 	 case 2:
		 		System.out.println("Enter the Student ID: "); 
		 		int input;
		 		Scanner scan = new Scanner(System.in);
		 		input = scan.nextInt();
		 		studentRepositoryObject.deleteStudent(input);
		 		System.out.println("\nStudent with student id " + input + " is deleted\n");
		 		System.out.println(studentRepositoryObject.findAllStudents());
		 		break;
		 		
		 	 case 3:
		 		 // this is where I'm getting confusion where to store these values.
		 		 Scanner sc = new Scanner(System.in);
		 		 System.out.println("Enter your ID:");
				 int studentId = sc.nextInt();
				 System.out.println("Enter your First Name");
				 String firstName = sc.next();
				 System.out.println("Enter your Last Name");
				 String lastName = sc.next();
				 System.out.println("Enter your Grade");
				 char grade = sc.next().charAt(0);
				 System.out.println("Student Id: " + studentId + "  First Name: " + firstName + "  Last Name: " + lastName + "  Grade: " + grade + "\n==============");
				 studentRepositoryObject.addNewStudent(new Student(studentId,firstName,lastName,grade));
				 System.out.println("\n Updated Student List\n" + studentRepositoryObject.findAllStudents()+"\n=======================");
		 		break;
		 		
		 	 case 4:
		 		System.out.println("Enter the Student ID: "); 
		 		int number;
		 		Scanner scann = new Scanner(System.in);
		 		number = scann.nextInt();
			 	System.out.println("The grade of the student is: "+studentRepositoryObject.findGradeForStudent(number)+"\n");
		 		break;
		 		
		 	case 5:
		 		studentRepositoryObject.printStudentsByGrade();
		 		break;
		 		
		 	 default:
				 System.out.println("ENTER THE CORRECT OPTION!");
				 break;
			}
		 }
			while(choice!=0);
			 System.out.println("Successfully completed the operation!" + " " +"Thanks for using the application!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
