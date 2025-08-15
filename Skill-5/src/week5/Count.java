package week5;
import java.util.Scanner;
public class Count {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter value to search: ");
	        int searchValue = sc.nextInt();

	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == searchValue) {
	                count++;
	            }
	        }

	        if (count == 0) {
	            System.out.println(searchValue + " is not present in the array.");
	        } else {
	            System.out.println(searchValue + " occurs " + count + " times in the array.");
	        }

	        sc.close();
	    }
}
