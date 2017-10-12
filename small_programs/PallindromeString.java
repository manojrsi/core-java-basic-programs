package java_basic.small_programs;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be checked for Pallindrome : ");
		String str = s.next();
		s.close();
		
		isPallindrome(str);
	}

	//abc
	private static void isPallindrome(String str) {
		char revChar;
		String rev = "";
		int len = str.length()-1;
		
		for(int i =len; i>=0; i--) {
			revChar = str.charAt(len);
			rev = rev + revChar;
			len--;
		}
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(str+" is pallindrome.");
		} else {
			System.out.println(str+" is not pallindrome.");
		}
	}

}
