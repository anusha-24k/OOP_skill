package week3;
import java.util.Scanner;
public class PerfectSquareCheck {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sqrtValue = (int) Math.sqrt(number);

        if (sqrtValue * sqrtValue == number) {
            System.out.println(number + " is a Perfect Square.");
        } else {
            System.out.println(number + " is NOT a Perfect Square.");
        }

        scanner.close();
    }
}
