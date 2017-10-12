package java_basic.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {7,8,5,2,4,6,3};
		int opArr[] = insertionSort(arr);
		
		for(int i=0;i<opArr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	//7,8,5,2,4,6,3
	private static int[] insertionSort(int[] array) {
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];//8,   
            int i = j-1;       //0
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  //7
                i--;  //-1
            }  
            array[i+1] = key;  
        }  
        return array;
    }  

}
