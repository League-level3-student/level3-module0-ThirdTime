package _03_More_Array_Fun;

import java.lang.reflect.Array;
import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	String userEnteredWord1 = JOptionPane.showInputDialog(null, "Please enter a word without spaces.");
	String userEnteredWord2 = JOptionPane.showInputDialog(null, "Please enter a word without spaces.");
	String userEnteredWord3 = JOptionPane.showInputDialog(null, "Please enter a word without spaces.");
	String userEnteredWord4 = JOptionPane.showInputDialog(null, "Please enter a word without spaces.");

	String listOfWords[] = {userEnteredWord1, userEnteredWord2, userEnteredWord3, userEnteredWord4};
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	stringArrayPrinter(listOfWords);
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	stringArrayEvenNumPrinter(listOfWords);
	
	/**DO THIS NEXT WEEK
	 * 	5. Write a method that takes an array of Strings and prints all the Strings in the array
	   in a completely random order. Almost every run of the program should result in a different order.
	 */
	
	}
	
	public static void stringArrayPrinter(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void stringArrayEvenNumPrinter(String[] array) {
		for(int i = 0; i < array.length; i = i+2) {
			System.out.println(array[i]);
		}
	}
	
}
