package Exception;

public class SampleExceptions {

	public static void main(String[] args) {
	String str = null;
	//System.out.print(str.length());
	try {
		int a = 50;
		int b = 0;
		int c = a/b;
		System.out.println("Result=" + c);
	}
	catch(ArithmeticException e) {
		//System.out.print("Can't divide number by 0.");
		System.out.println(e);
	}
	try {
		int number = Integer.parseInt("String");
		System.out.print(number);
	}
	catch(NumberFormatException e) {
		System.out.println("Number Format Exception");
	}
	}

}
