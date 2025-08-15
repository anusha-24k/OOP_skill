package week5;
import java.util.Scanner;
public class MatrixSum {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the square matrix (n): ");
	        int n = sc.nextInt();

	        int[][] matrix = new int[n][n];

	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            int rowSum = 0;
	            for (int j = 0; j < n; j++) {
	                rowSum += matrix[i][j];
	            }
	            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
	        }

	        for (int j = 0; j < n; j++) {
	            int colSum = 0;
	            for (int i = 0; i < n; i++) {
	                colSum += matrix[i][j];
	            }
	            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
	        }

	        sc.close();
	    }
}
