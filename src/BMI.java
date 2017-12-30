import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        //Create a object from Scanner class
        Scanner input = new Scanner(System.in);

        //Take weight input from the user
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //Take height input from the user
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        //Comput BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInKilograms = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInKilograms * heightInKilograms);

        //Dispaly result
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
