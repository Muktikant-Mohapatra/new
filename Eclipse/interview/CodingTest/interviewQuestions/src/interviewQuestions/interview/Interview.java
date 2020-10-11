package interviewQuestions.interview;

public class Interview {
	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 2, 3, 8, 5, 2, 0, 3, 8, 1, 4, 9, 1 };
		
		for (int i = 0; i < arr.length; i++) {
			if (i==1) {
				if (i==1) {
				
				}
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (j < arr.length - 1) {

					if (arr[i] == arr[j]) {
						count++;
						int k = arr[i + 1];
						arr[i + 1] = arr[j];
						arr[j] = k;
					}
				}

			}
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
                    					
				}else {
					
				}
			}
			

		}
		System.out.println(count);
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
	}
}
