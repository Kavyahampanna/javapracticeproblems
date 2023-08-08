package javapracticeproblems;

public class Main1 {
//Rotate a given nXn array 90 degrees clockwise
//Input
//123
//456
//789
//Output
//741
//852
//963
	
				    public static void rotateArrayClockwise(int[][] arr) {
				        int n = arr.length;

				        // Transpose the matrix
				        for (int i = 0; i < n; i++) {
				            for (int j = i; j < n; j++) {
				                int temp = arr[i][j];
				                arr[i][j] = arr[j][i];
				                arr[j][i] = temp;
				            }
				        }

				        // Reverse each row to get the final result
				        for (int i = 0; i < n; i++) {
				            for (int j = 0; j < n / 2; j++) {
				                int temp = arr[i][j];
				                arr[i][j] = arr[i][n - 1 - j];
				                arr[i][n - 1 - j] = temp;
				            }
				        }
				    }

				    public static void printArray(int[][] arr) {
				        int n = arr.length;
				        for (int i = 0; i < n; i++) {
				            for (int j = 0; j < n; j++) {
				                System.out.print(arr[i][j] + " ");
				            }
				            System.out.println();
				        }
				    }

				    public static void main(String[] args) {
				        int[][] arr = {
				                {1, 2, 3},
				                {4, 5, 6},
				                {7, 8, 9}
				        };

				        System.out.println("Original Array:");
				        printArray(arr);

				        rotateArrayClockwise(arr);

				        System.out.println("\nRotated Array:");
				        printArray(arr);
				    }
}
				


			




	


