package selection_sorting_algorithm;

public class SelectionSortingAlgorithm {

	public int[] sortAccending(int[] values) {
		int temp=0;
		
		for(int i=0;i<values.length;i++) {
			for (int j = i+1; j < values.length; j++) {
				if (values[i]>values[j]) {
                  	temp=values[i];
                  	values[i]=values[j];
                  	values[j]=temp;
				}
			}
		}
		
		return values;
	}
	public int[] sortDecending(int[] values) {
		int temp=0;
		
		for(int i=0;i<values.length;i++) {
			for (int j = i+1; j < values.length; j++) {
				if (values[i]<values[j]) {
                  	temp=values[i];
                  	values[i]=values[j];
                  	values[j]=temp;
				}
			}
		}
		
		return values;
	}
	
}
