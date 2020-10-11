package test;

import bubble_sort_algorithm.BubbleSortAlgorithm;
import insertion_sorting_algorithm.InsertionSortingAlgorithm;
import merge_sort_algorithm.MergeSortAlgorithm;
import selection_sorting_algorithm.SelectionSortingAlgorithm;

public class AlgorithmTest {
	public static void main(String[] args) {
		int[] valueArray=new int[] {15,25,40,30,90,70,100,665};
         SelectionSortingAlgorithm selectionSortingAlgorithm=new SelectionSortingAlgorithm();
         BubbleSortAlgorithm bubbleSortAlgorithm=new BubbleSortAlgorithm();
         InsertionSortingAlgorithm insertionSortingAlgorithm=new InsertionSortingAlgorithm();
        MergeSortAlgorithm mergeSortAlgorithm=new MergeSortAlgorithm();
         //int[] sortedValue = selectionSortingAlgorithm.sortDecending(valueArray);
        // int[] sortedValue=bubbleSortAlgorithm.sortDecending(valueArray);
         //int[] sortedValue=insertionSortingAlgorithm.sortAccending(valueArray);
         int firstPointer=0;
         int lastPointer=valueArray.length-1;
         mergeSortAlgorithm.mergeSortAccending(valueArray,firstPointer,lastPointer);
         for (int i : valueArray) {
			System.out.println(i);
		}
         
	}
}
