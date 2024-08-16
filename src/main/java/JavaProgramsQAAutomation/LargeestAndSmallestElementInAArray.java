package JavaProgramsQAAutomation;

public class LargeestAndSmallestElementInAArray {

	public static void main(String[] args) {
		int[][] a = { { 2, 6, 7 }, { 8, 9, 4 }, { 1, 3, 0 } };
		int min = a[0][0];
		int col = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					col = j;
				}
			}
		}

		System.out.println("Smallest Elemnt: " + min);
		System.out.println("smallest Element Present in the column: " + col);

		int max = a[0][col];
		int k = 0;
		while (k < 3) {
			if (a[k][col] > max) {
				max = a[k][col];
			}
			k++;
		}
		System.out.println("Largest Elemnt in the column of smallest Element Presented: " + max);
	}

}
