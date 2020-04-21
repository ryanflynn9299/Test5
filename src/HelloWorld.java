import java.util.Scanner;


public class HelloWorld {
	
	public static String getMessage() {
		String message;
		Scanner in = new Scanner(System.in);
		
		System.err.print("You must say things now: ");
		message = in.nextLine();
		
		return message;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = getMessage();
		
		System.out.println("You said: " + msg + "!!");
	}

}
