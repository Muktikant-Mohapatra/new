package BubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
		int k = 1;
		int arr[] = { 2, 3, 8, 5, 2, 0, 3, 8, 1, 4, 9, 1 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					k = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = k;
				}
			}
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
		int newArr[] = new int[arr.length - count+1];
		int l = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				newArr[l] = arr[i];
				l++;
				} 
			}
			
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}
	}
}
