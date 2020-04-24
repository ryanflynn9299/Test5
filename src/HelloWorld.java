import java.util.Scanner;


public class HelloWorld {
	
	private static int getNumber(int i) {
		return i++;
	}
	
	public static String getMessage() {
		String message;
		int i = 0;
		
		Scanner in = new Scanner(System.in);
		i = getNumber(i);
		System.err.print("Do speech things " + i + ": ");
		message = in.nextLine();
		
		return message;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = getMessage();
		
		System.out.println("You said: " + msg + "!!");
	}

}
