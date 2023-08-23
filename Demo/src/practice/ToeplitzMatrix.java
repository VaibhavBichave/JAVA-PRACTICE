package practice;

public class ToeplitzMatrix {
	boolean isToeplitz(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				if (array[i][j] != array[i + 1][j + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	void print2D(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ToeplitzMatrix ToeplitzMatrix = new ToeplitzMatrix();
		int testcase1[][] = { { 1, 2, 3, 4 }, { 9, 1, 2, 3 }, { 5, 9, 1, 2 } };
		System.out.println("The Matrix is ::");
		ToeplitzMatrix.print2D(testcase1);
		System.out.println("ToeplitzMatrix Status : " + ToeplitzMatrix.isToeplitz(testcase1));

		int testcase2[][] = { { 4, 2, 3, 4 }, { 9, 6, 2, 3 }, { 5, 9, 8, 2 } };
		System.out.println("\nThe Matrix is ::");
		ToeplitzMatrix.print2D(testcase2);
		System.out.println("ToeplitzMatrix Status : " + ToeplitzMatrix.isToeplitz(testcase2));

	}
}
