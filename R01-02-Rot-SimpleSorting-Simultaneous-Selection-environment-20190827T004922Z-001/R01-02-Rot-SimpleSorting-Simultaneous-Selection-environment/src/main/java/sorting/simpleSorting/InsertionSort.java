package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		for (int i = leftIndex; i < rightIndex; i++) {
			int el1 = i;
			int el2 = i + 1;
			if (array[i].compareTo(array[i + 1]) > 0) {
				while (array[el1].compareTo(array[el2]) > 0) {
					if (el1 < leftIndex) {
						break;
					}
					T aux = array[el1];
					array[el1] = array[el2];
					array[el2] = aux;
					if (el1 > 0) {
						el1--;
						el2--;
					}

				}
			}

		}
	}
}
