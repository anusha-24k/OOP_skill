package week5;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] data = new int[size];

        System.out.println("Enter array values:");
        for (int index = 0; index < size; index++) {
            data[index] = input.nextInt();
        }

        
        for (int pass = 0; pass < size - 1; pass++) {
            for (int pos = 0; pos < size - 1 - pass; pos++) {
                if (data[pos] > data[pos + 1]) {
                    int swap = data[pos];
                    data[pos] = data[pos + 1];
                    data[pos + 1] = swap;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

