import java.util.Scanner;

public class DisplayTime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// Take input from the user
		System.out.println("Enter an integer for seconds : ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes in seconds
		int remaningSeconds = seconds % 60; // Find remaning seconds
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remaningSeconds + " seconds"); 
	}
}