package java_basic.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {5,1,4,2,8};

		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {

		for(int i=1;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				int temp = 0;
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
		}

	}

}
