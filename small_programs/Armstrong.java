package java_basic.small_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try {
			System.out.println("Enter the number : ");
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		isArmstrongNumber(num);
	}

	private static void isArmstrongNumber(int num) {
		int number = num;
		int sum = 0;
		int single = 0;
		while(num > 0) {
			single = num%10;
			sum = sum + single*single*single;
			num = num/10;
		}
		if(number == sum) {
			System.out.println(sum+" is a armstrong number");
		} else {
			System.out.println(sum+" is not a armstrong number");
		}
	}

}
