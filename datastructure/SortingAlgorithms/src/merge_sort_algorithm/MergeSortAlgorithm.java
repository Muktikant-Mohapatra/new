package merge_sort_algorithm;

public class MergeSortAlgorithm {

	public void mergeSortAccending(int[] valueArray, int firstPointer, int lastPointer) {
		if (firstPointer<lastPointer) {
			int middlePointer=(firstPointer+lastPointer)/2;
			//left array
			mergeSortAccending(valueArray, firstPointer, middlePointer);
			//right array
			mergeSortAccending(valueArray, middlePointer+1,lastPointer);
			//merge sorted array
			 mergeSortedArray(valueArray,firstPointer,middlePointer,lastPointer);
		}
	}

	private void mergeSortedArray(int[] valueArray, int firstPointer, int middlePointer, int lastPointer) {
        int leftArrSize=middlePointer-firstPointer+1;
        int rightArrSize=lastPointer-middlePointer;
	}

}
