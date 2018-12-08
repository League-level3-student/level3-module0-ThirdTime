public class ArrayWarmup {
	public static void main(String[] args) {
		int missingNumberList[] = { 1, 2, 3, 0, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println("The number missing is " + numberCalculator(missingNumberList) + ".");
	}

	public static int findMissingArrayNum(int[] array) {
		int completeArraySum = 33;
		int missingNumber = completeArraySum - incompleteArraySum(array);
		return missingNumber;
	}

	public static int incompleteArraySum(int[] array) {
		int totalSum = 0;
		for (int i = 0; i < array.length; i++) {
			totalSum = totalSum + array[i];
		}
		return totalSum;
	}
	
	public static int numberCalculator(int [] array) {
		// this only works for arrays like 1, 2, 3, 4
		// where the array has an even length
		// but it can calculate for arrays as long as you want as long as it meets those 2 requirements
		
		return 1 + array.length * (array.length /2);
	}
}
