package java_basic.small_programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] numbers = {4,5,8,44,41};

		primeNumbers(numbers);

	}

	private static void primeNumbers(int[] numbers) {

		List<Integer> primeList = new ArrayList<Integer>();
		for(int num: numbers) {
			boolean primeFlag = true;
			for(int i = 2; i < numbers.length; i++) {
				if(num%i==0) {
					primeFlag = false;
				} 
			}
			if(primeFlag) {
				primeList.add(num);
			}
		}
		System.out.println("PrimeNumber.primeNumbers() : "+primeList);
	}

}
