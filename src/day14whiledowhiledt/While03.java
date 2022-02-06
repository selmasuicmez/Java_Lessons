package day14whiledowhiledt;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/* Interview Question
		 Type java code by using while loop, 
         Write a program that prompts the user to input an integer. 
         It should then find sum of the digits of that number. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = scan.nextInt();
		int sum = 0;
		
		while(num!=0) {			
			int lastDigit = num%10;			
			num = num/10;			
			sum = sum + lastDigit;		
		}		
		System.out.println(sum);
		
		scan.close();
		
	}

}
