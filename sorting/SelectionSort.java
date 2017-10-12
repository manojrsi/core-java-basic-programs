package java_basic.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {11,25,12,22,64};
		int opArr[] = selectionSort(arr);
		
		for(int i=0;i<opArr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	//11,25,12,22,64
	private static int[] selectionSort(int[] arr) {
		int min = 0;
		int tmp = 0;
		for(int i=0;i<=arr.length-1;i++) {
			min = i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}

}
