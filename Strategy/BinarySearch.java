package Strategy;

import java.util.*;

public class BinarySearch implements SearchStrategy {

	@Override
	public void search(int[] numbers, int a) {
		System.out.println("Binary Search!");

		int size = numbers.length;  // Número de elementos
		int middle = size/2;        // Mitad del array
			
		System.out.println("Size: " + size);
		System.out.println("Middle: " + middle);
		System.out.println("Array: " + Arrays.toString(numbers));
			
		if (numbers[middle] == a)
			System.out.println("Lo encontré en la posición " + middle);
		else if (size == 1)
			System.out.println("No lo encontre");
		else if (numbers[middle] > a)
			search(Arrays.copyOfRange(numbers,0,middle),a);
		else
			search(Arrays.copyOfRange(numbers,middle+1,size),a);
	}
}