package assignments;
public class Exceptions {

	public static void main(String[] args) {
		
	Exceptions exception = new Exceptions();
	System.out.println("Arithmetic exceptions");
	exception.arithmeticExceptionDemo();
	
	System.out.println("Null Pointer Exception");
	exception.nullPointerExceptionDemo();
	
	System.out.println("String Index Out Of Bounds Exception");
	exception.stringIndexOutOfBoundsExceptionDemo();
	}
	void arithmeticExceptionDemo(){

		try {
			int a = 30, b = 0;
			int c = a/b; // cannot divide by zero
			System.out.println ("Result = " + c);
		}
		catch(ArithmeticException e) {
			System.out.println ("Can't divide a number by 0");
		}
	}
	void nullPointerExceptionDemo(){
		try {
			String a = null; //null value
			System.out.println(a.charAt(0));
		} catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
	void stringIndexOutOfBoundsExceptionDemo() {
		try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24); // accessing 25th element
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}

