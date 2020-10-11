package dynamic_array;

public class DynamicArray {
	private static final int INITIALSIZE = 16;
	private int[] array;
	private int size;

	public DynamicArray() {
		array = new int[INITIALSIZE];
	}

	public DynamicArray(int initialCapacity) {
		array = new int[initialCapacity];
	}

	public void insert(int value) {
		// if the array is full,resize array
		if (array.length == size) {
			resize();
		}
		// add value after last value of an array
		array[size++] = value;
	}

	private void resize() {
		int[] newArray = new int[size * 2];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	public int removeAt(int index) {
		// validate the index
		if (index < 0 || index >= size) {
          throw new IllegalArgumentException("enter valid index.Index doesnot exists");
		}
		//shift all the elements to the left to fill the hole
		for (int i = index; i < size; i++) {
			array[i]=array[i+1];
		}
		size--;
		return array[index];
	}

	public int indexOf(int value) {
       for (int j = 0; j < size; j++) {
		if (value==array[j]) {
			return j;
		}
	}
		return -1;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

}
