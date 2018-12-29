package _03_More_Array_Fun;

import java.lang.reflect.Array;
import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	/**
	 * // 1. Create a main method to test the other methods you write. // public
	 * static void main(String[] args) {
	 * 
	 * // 2. Write a method that takes an array of Strings and prints all the
	 * Strings // in the array. String userEnteredWord1 =
	 * JOptionPane.showInputDialog(null, "Please enter a word without spaces.");
	 * String userEnteredWord2 = JOptionPane.showInputDialog(null, "Please enter a
	 * word without spaces."); String userEnteredWord3 =
	 * JOptionPane.showInputDialog(null, "Please enter a word without spaces. ");
	 * String userEnteredWord4 = JOptionPane.showInputDialog(null, "Please enter a
	 * word without spaces.");
	 * 
	 * String listOfWords[] = {userEnteredWord1, userEnteredWord2, userEnteredWord3,
	 * userEnteredWord4};
	 * 
	 * // 3. Write a method that takes an array of Strings and prints all the
	 * Strings // in the array // in reverse order. stringArrayPrinter(listOfWords);
	 * 
	 * // 4. Write a method that takes an array of Strings and prints every other //
	 * String in the array. stringArrayEvenNumPrinter(listOfWords);
	 * 
	 * /** DO THIS NEXT WEEK 5. Write a method that takes an array of Strings and
	 * prints all the Strings in the array in a completely random order. Almost
	 * every run of the program should result in a different order.
	 * 
	 * @return
	 * 
	 * 
	 * 		}
	 * 
	 */
	public static String stringArrayPrinter(String[] array) {
		String allWords = "";
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				allWords = allWords + array[i];
			} else {
				allWords = allWords + array[i] + ", ";
			}
		}
		return allWords;
	}

	public static String stringArrayEvenIndexPrinter(String[] array) {
		String allWords = "";
		for (int i = 1; i < array.length; i = i + 2) {
			if (i == array.length - 1) {
				allWords = allWords + array[i];
			} else if (i == array.length - 2) {
				allWords = allWords + array[i];
			} else {
				allWords = allWords + array[i] + ", ";
			}
		}
		return allWords;
	}

	public static String stringArrayReverseOrderPrinter(String[] array) {
		String allWords = "";
		for (int i = array.length -1; i >= 0; i--) {
			if (i == 0) {
				allWords = allWords + array[i];
			} else {
				allWords = allWords + array[i] + ", ";
			}
		}
		return allWords;
	}

}
