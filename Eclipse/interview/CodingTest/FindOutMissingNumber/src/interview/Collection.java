package interview;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
	public static void main(String[] args) {
		int j = 0;
		int i;
		ArrayList<Integer> missingNumberArrayList = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(7);
		a.add(3);
		a.add(1);
		a.add(9);
		a.add(12);
		System.out.println("Given Numbers :" + a);
		Collections.sort(a);
		while (j < a.size() - 1) {

			i = a.get(j);
			if (i + 1 < a.get(j + 1)) {
				a.add(i + 1);
				missingNumberArrayList.add(i + 1);
				Collections.sort(a);
				j++;
			} else {
				j++;
			}

		}
		System.out.println("Missing Numbers :" + missingNumberArrayList);
	}
}
