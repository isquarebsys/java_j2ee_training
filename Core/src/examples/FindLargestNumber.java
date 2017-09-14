package examples;

import java.util.Random;

public class FindLargestNumber {

	public int findKthLargest(int[] arrayOfIntegers, int K) {
		int max = 0;
		if (K > 0 && K < 10) {
			// Do Nothing
		} else {
			max = arrayOfIntegers[0];
			for (int i = 0; i < arrayOfIntegers.length; i++) {
				if (max < arrayOfIntegers[i]) {
					max = arrayOfIntegers[i];
				}
			}
			System.out.println("Maximum value:" + max);
		}
		return max;
	}

	public static void main(String[] args) {
		int n = 10000;
		int maxValue=10;
		int a[] = new int[n];
		for (int i = 0; i < 10000; i++) {
			Random rand = new Random();
			int n1 = rand.nextInt(maxValue-1) + 1;
			a[i] = n1;
			//System.out.println("Random Number: " + n1);
		}
		FindLargestNumber findLargestNumber = new FindLargestNumber();
		System.out.println("Largest Number: " + findLargestNumber.findKthLargest(a, maxValue));

	}

}
