package insertion_sorting_algorithm;

public class InsertionSortingAlgorithm {
	public int[] sortAccending(int[] values) {
		for(int i=1;i<values.length;i++) {
			int key=values[i];
			int j=i-1;
			while (j>=0&&values[j]<key) {
				values[j+1]=values[j];
				j=j-1;
			}
			values[j+1]=key;
		}
		return values;
	}

	public int[] sortDecending(int[] values) {

		return values;
	}
}
