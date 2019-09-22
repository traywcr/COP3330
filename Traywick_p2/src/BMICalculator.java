import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userChoice, weight, BMI;
		float height;
		
		System.out.println("BMI Calculator\n");
		
		
		System.out.print("Would you like to use (1) standard (in / lbs) or (2) metric (kg / m) measurements?");
		Scanner in = new Scanner(System.in);
		userChoice = in.nextInt();

		if(userChoice == 1) {
			System.out.print("Enter your weight in pounds: ");
			weight = in.nextInt();
			System.out.print("Enter your height in inches: ");
			height = in.nextInt();
			
			BMI = (int) ((703 * weight) / (height * height));
			System.out.println("Your BMI is: " + BMI);
			
			System.out.println("\nBMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal Weight = 18.5 - 24.9");
			System.out.println("Overweight = 25 29.9");
			System.out.println("Obesity = >30");
			
		}
		
		else if(userChoice == 2) {
			System.out.print("Enter your weight in kilograms: ");
			weight = in.nextInt();
			System.out.print("Enter your height in centimeters: ");
			height = in.nextFloat();
			BMI = (int) ((weight) / (height * height));
			System.out.println("Your BMI is: " + BMI);
			
			System.out.println("\nBMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal Weight = 18.5 - 24.9");
			System.out.println("Overweight = 25 29.9");
			System.out.println("Obesity = >30");
		}
		
		else {
			System.out.print("Invalid Option");
		}
		
		
	}

}
