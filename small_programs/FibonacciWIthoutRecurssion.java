package java_basic.small_programs;

import java.util.Scanner;

public class FibonacciWIthoutRecurssion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.close();
		fibonaccisSeries(size);
	}

	//0 1 1 2 3 5 8 13 21
	private static void fibonaccisSeries(int size) {
		
		int prev = 0;
		int next = 1;
		int sum = 0;
		System.out.println(prev);
		System.out.println(next);
		for(int i=1;i<size;i++) {
			sum = prev + next;// 1 2
			prev = next;
			next = sum;
			System.out.println(sum);
		}
		
	}

}
