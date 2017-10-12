package java_basic.small_programs;

import java.util.Scanner;

public class UpsideDownTraingle {

	public static void main(String[] args) {
		
//		int triangleSize = 0;
//		for(int i=0;i<args.length;i++) {
//			triangleSize = Integer.parseInt(args[0]);
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the trianlgle size: ");
		int triangleSize = scanner.nextInt();
		scanner.close();
		
		if(triangleSize%2 == 0) {
			triangleSize = triangleSize+1;
		}
		
		upsideDownTraingle(triangleSize); 
	}

	private static void upsideDownTraingle(int size) {
		
		for(int i=0;i<=size;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<(size-i*2);k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
