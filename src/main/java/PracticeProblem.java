public class PracticeProblem {
     // Method 1: Calculates the sum of all elements in a 2D array
	 public static int sum2D(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

	 // Method 2: Returns the sum of all elements in a given row
	 public static int sumRow(int[][] array, int row) {
        int sum = 0;
        if (row >= 0 && row < array.length) {
            for (int j = 0; j < array[row].length; j++) {
                sum += array[row][j];
            }
        }
        return sum;
    }

	 // Method 3: Returns the sum of all elements in a given column
	 public static int sumColumn(int[][] array, int col) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (col >= 0 && col < array[i].length) {
                sum += array[i][col];
            }
        }
        return sum;
    }

 // Main method for testing
	public static void main(String args[]) {
		int[][] sampleArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

		System.out.println("Sum of all elements (sum2D): " + sum2D(sampleArray));
        System.out.println("Sum of row 0 (sumRow): " + sumRow(sampleArray, 0));
        System.out.println("Sum of column 1 (sumColumn): " + sumColumn(sampleArray, 1));

	}
}
