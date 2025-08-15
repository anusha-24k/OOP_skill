package week6;
import java.util.Scanner;
public class Prime {
	 public boolean checkPrime(int value) {
	        if (value <= 1) {
	            return false;
	        }
	        for (int divisor = 2; divisor <= Math.sqrt(value); divisor++) {
	            if (value % divisor == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = input.nextInt();

	        Prime tester = new Prime();
	        boolean isPrime = tester.checkPrime(number);

	        if (isPrime) {
	            System.out.println(number + " is a Prime Number.");
	        } else {
	            System.out.println(number + " is Not a Prime Number.");
	        }

	        input.close();
	    }
	}

