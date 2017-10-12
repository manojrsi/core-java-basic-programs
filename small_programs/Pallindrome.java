package java_basic.small_programs;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be checked for Pallindrome : ");
		int num = s.nextInt();
		s.close();
		
		isPallindrome(num);
	}

	//123
	private static void isPallindrome(int num) {
		int rem = 0;
		int sum = 0;
		int number = num;
		while(num > 0) {
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		System.out.println("Reverese value of number "+number+" is : "+sum);
		if(number == sum) {
			System.out.println(number +" is pallindrom");
		} else {
			System.out.println(number +" is not pallindrom");
		}
		
		
	}

}
