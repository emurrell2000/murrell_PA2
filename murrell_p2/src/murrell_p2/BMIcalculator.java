package murrell_p2;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Which formula would you like to use? 0 = Pounds/Inches, 1 = Kilograms/Meters");
		int choice = in.nextInt();
		System.out.println("Please enter your weight:");
		double weight = in.nextDouble();
		System.out.println("Please enter your height:");
		double height = in.nextDouble();
		double bmi = 0;
		
		if(choice == 0) {
			bmi = (703 * weight) / (height * height);
		}
		else {
			bmi = weight / (height * height);
		}
		System.out.printf("Your BMI is: %.1f%n%n", bmi);
		
		System.out.println("BMI Categories from the National Heart Lung and Blood Institute:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
	}

}
