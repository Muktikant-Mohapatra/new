package bubble_sort_algorithm;

public class BubbleSortAlgorithm {
	public int[] sortAccending(int[] values) {
	    for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length-i-1; j++) {
				if (values[j]>values[j+1]) {
					int temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp; 
				}
			}
		} 
		return values;
	}
	public int[] sortDecending(int[] values) {
		 for (int i = 0; i < values.length; i++) {
				for (int j = 0; j < values.length-i-1; j++) {
					if (values[j]<values[j+1]) {
						int temp=values[j];
						values[j]=values[j+1];
						values[j+1]=temp; 
					}
				}
			} 
		return values;
	}
}
