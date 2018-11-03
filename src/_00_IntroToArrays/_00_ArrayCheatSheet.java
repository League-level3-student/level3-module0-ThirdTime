package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] elements = new String[5];
		// 2. print the third element in the array
		System.out.println(elements[3]);
		// 3. set the third element to a different value
		elements[3] = "testing element 3";
		// 4. print the third element again
		System.out.println(elements[3]);
		// 5. use a for loop to set all the elements in the array to a string of
		// your choice
		for (int i = 0; i < elements.length; i++) {
			elements[i] = "This is element number " + i + "!";
		}

		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}

		System.out.println("--NOW TESTING INT ARRAY--");

		// 7. make an array of 50 integers
		Integer[] arrayOfInts = new Integer[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		Random randomNumberGenerator = new Random();
		int smallestNumToPrint = Integer.MAX_VALUE;
		int largestNumToPrint = Integer.MIN_VALUE;
		int secondLargestNumToPrint = Integer.MIN_VALUE;

		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = randomNumberGenerator.nextInt(100);
			System.out.println(arrayOfInts[i]);
		}

		// 9. without printing the entire array, print only the smallest number
		// on the array
		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < smallestNumToPrint) {
				smallestNumToPrint = arrayOfInts[i];
			}
		}
		System.out.println("SMALLEST NUMBER: " + smallestNumToPrint);

		// 11. print the largest and second largest number in the array.
		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] > largestNumToPrint) {
				secondLargestNumToPrint = largestNumToPrint;

				largestNumToPrint = arrayOfInts[i];
			}
		}
		System.out.println("SECOND LARGEST NUMBER: " + secondLargestNumToPrint);
		System.out.println("LARGEST NUMBER: " + largestNumToPrint);

		// 12. print only the last element in the array
		System.out.println("THE LAST ELEMENT IN THE ARRAY IS: " + arrayOfInts[arrayOfInts.length - 1]);

	}
}
