import java.util.Scanner; // Scanner is in the java.util package

public class CalculatingAreaWithConsoleInput {
  public static void main(String[] args) {
    
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    // Take radius value from the user
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();

    // Calculate Area
    double area = radius * radius * 3.14159;

    // Show result with println
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  } 
}
