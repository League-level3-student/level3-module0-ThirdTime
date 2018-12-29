package _03_More_Array_Fun;

import java.lang.reflect.Array;
import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
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
