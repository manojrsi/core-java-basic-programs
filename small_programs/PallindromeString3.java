package java_basic.small_programs;

import java.util.Scanner;

public class PallindromeString3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be checked for Pallindrome : ");
		String str = s.next();
		s.close();
		
		isPallindrome(str);
	}

	//abc
	private static void isPallindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();

		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+" is a pallindrome");
		}else {
			System.out.println(str+" is not a pallindrome");
		}
		
	}

}
