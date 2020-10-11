package interview;

public class Array {

	public static void main(String[] args) {
		int temp;
		Integer[] number = { 7, 3, 1, 9, 12 };
		System.out.print("Given Number :");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;

				}
			}
		}
		System.out.print("Sorted Number :");
		for (int i = 0; i < number.length; i++) {

			System.out.print(number[i] + " ");
		}
		System.out.print("Missing Number :");
		for (int j = 0; j < number.length; j++) {

			if (j+1 < number.length) {
				number=new Integer[number.length+1];
				if (number[j + 1] > number[j]) {
					for (int i = number.length-1; i > j+1; i--) {
						
						System.out.println(number.length);
					}
					System.out.print(number[j] + 1 + " ");

				}
			}

		}
	}
}
