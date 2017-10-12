package java_basic.small_programs;

import java.util.Scanner;

public class FibonacciWithRecurssion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		s.close();
		int prev=0;
		int next = 1;
		System.out.println(prev);
		System.out.println(next);
		fibonaccisSeries(size,prev,next);
	}

	//0 1 1 2 3 5 8 13 21
	private static void fibonaccisSeries(int size,int prev,int next) {
		int sum = 0;
		if(size == 0) {
			return;
		}
		sum = prev + next;
		prev = next;
		next = sum;
		System.out.println(sum);
		fibonaccisSeries(size-1, prev, next);
		
	}

}

