package JavaProgramsQAAutomation;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 50 };

		Arrays.sort(arr);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[arr.length - 1]) {
				System.out.println("Second Largest is: " + arr[i]);
				break;
			}
		}
	}
}
