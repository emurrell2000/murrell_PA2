package murrell_p3;

import java.util.Scanner;

public class Survey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int cont = 1;
		String[] topics = {"Video Games", "Politics", "Sports", "Climate Change", "Cake"};
		int[][] responses = new int[5][10];
		int num = 0;
		
		while(cont == 1) {
			
			System.out.println("How interesting would you rate video games, from 1-10?");
			num = in.nextInt();
			responses[0][num-1]++;
			
			System.out.println("How interesting would you rate politics, from 1-10?");
			num = in.nextInt();
			responses[1][num-1]++;
			
			System.out.println("How interesting would you rate sports, from 1-10?");
			num = in.nextInt();
			responses[2][num-1]++;
			
			System.out.println("How important would you rate the issue of climate change, from 1-10?");
			num = in.nextInt();
			responses[3][num-1]++;
			
			System.out.println("How delicious would you rate cake, from 1-10?");
			num = in.nextInt();
			responses[4][num-1]++;
			
			
			System.out.println("Would you like to continue? Yes- 1 No- 2");
			cont = in.nextInt();
		}
		double sum = 0;
		for(int i=0; i<10; i++) {
			sum += responses[0][i]*(i+1);
		}
		double avg0 = sum/10;
		
		sum = 0;
		for(int i=0; i<10; i++) {
			sum += responses[1][i]*(i+1);
		}
		double avg1 = sum/10.0;
		
		sum = 0;
		for(int i=0; i<10; i++) {
			sum += responses[2][i]*(i+1);
		}
		double avg2 = sum/10.0;
		
		sum = 0;
		for(int i=0; i<10; i++) {
			sum += responses[3][i]*(i+1);
		}
		double avg3 = sum/10.0;
		
		sum = 0;
		for(int i=0; i<10; i++) {
			sum += responses[4][i]*(i+1);
		}
		double avg4 = sum/10.0;
		
		System.out.printf("                1  2  3  4  5  6  7  8  9  10%n");
		System.out.printf("%s     %d  %d  %d  %d  %d  %d  %d  %d  %d  %d  %.2f%n", topics[0], responses[0][0], responses[0][1], responses[0][2], responses[0][3], responses[0][4], responses[0][5], responses[0][6], responses[0][7], responses[0][8], responses[0][9], avg0);
		System.out.printf("%s        %d  %d  %d  %d  %d  %d  %d  %d  %d  %d  %.2f%n", topics[1], responses[1][0], responses[1][1], responses[1][2], responses[1][3], responses[1][4], responses[1][5], responses[1][6], responses[1][7], responses[1][8], responses[1][9], avg1);
		System.out.printf("%s          %d  %d  %d  %d  %d  %d  %d  %d  %d  %d  %.2f%n", topics[2], responses[2][0], responses[2][1], responses[2][2], responses[2][3], responses[2][4], responses[2][5], responses[2][6], responses[2][7], responses[2][8], responses[2][9], avg2);
		System.out.printf("%s  %d  %d  %d  %d  %d  %d  %d  %d  %d  %d  %.2f%n", topics[3], responses[3][0], responses[3][1], responses[3][2], responses[3][3], responses[3][4], responses[3][5], responses[3][6], responses[3][7], responses[3][8], responses[3][9], avg3);
		System.out.printf("%s            %d  %d  %d  %d  %d  %d  %d  %d  %d  %d  %.2f%n", topics[4], responses[4][0], responses[4][1], responses[4][2], responses[4][3], responses[4][4], responses[4][5], responses[4][6], responses[4][7], responses[4][8], responses[4][9], avg4);
		
		
		
	}

}
