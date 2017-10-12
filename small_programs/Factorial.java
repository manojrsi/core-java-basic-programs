package java_basic.small_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the factorial number : ");
		int fact =0;
		
		try {
			fact = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//int fact = 5;
		for(int i=fact-1 ;i>0;i--) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}

}
