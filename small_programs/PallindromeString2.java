package java_basic.small_programs;

import java.util.Scanner;

public class PallindromeString2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be checked for Pallindrome : ");
		String str = s.next();
		s.close();
		
		isPallindrome(str);
	}

	//abc
	private static void isPallindrome(String str) {

		int length = str.length();
		int begin = 0;
		int end = length-1;
		int mid = (begin+end)/2;
		boolean isPallin = true;
		for(int i=0; i<mid; i++) {
			if(str.charAt(begin) == str.charAt(end)) {
				begin++;
				end--;
			} else {
				isPallin = false;
				break;
			}
		}
		if(isPallin) {
			System.out.println(str+" is a pallindrome");
		}else {
			System.out.println(str+" is not a pallindrome");
		}
	}

}
