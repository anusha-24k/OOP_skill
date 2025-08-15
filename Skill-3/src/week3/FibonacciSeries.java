package week3;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int nTerms = scanner.nextInt();   

        int previous = 0;   
        int current = 1;    

        System.out.print("Fibonacci Series up to " + nTerms + " terms: ");

        for (int count = 1; count <= nTerms; count++) {
            System.out.print(previous + " ");
            int nextValue = previous + current;
            previous = current;
            current = nextValue;
        }

        scanner.close();
    }
}

