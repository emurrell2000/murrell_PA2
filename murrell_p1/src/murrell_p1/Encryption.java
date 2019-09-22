package murrell_p1;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your 4 digit number: ");
		int number = in.nextInt();
		
		int num1 = number/1000;
		int num2 = number/100%10;
		int num3 = number%100/10;
		int num4 = number%10;
		
		num1 = (num1+7)%10;
		num2 = (num2+7)%10;
		num3 = (num3+7)%10;
		num4 = (num4+7)%10;
		
		int numtemp = num1;
		num1 = num3;
		num3 = numtemp;
		
		numtemp = num2;
		num2 = num4;
		num4 = numtemp;
		
		System.out.printf("%d%d%d%d", num1, num2, num3, num4);
		
	}

}