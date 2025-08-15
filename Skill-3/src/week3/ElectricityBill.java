package week3;
import java.util.Scanner;
public class ElectricityBill {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of units consumed: ");
	        int units = sc.nextInt();

	        double billAmount = 0;

	        if(units <= 50) {
	            billAmount = units * 3;
	        }
	        else if(units <= 100) {
	            billAmount = units * 3;
	        }
	        else if(units <= 300) {
	            billAmount = (units * 5) + 100;  
	        }
	        else if(units <= 450) {
	            billAmount = (units * 6) + 200; 
	        }
	        else {
	            billAmount = (units * 8) + 250;  
	        }

	        System.out.println("Units consumed : " + units);
	        System.out.println("Total bill amount to pay: Rs. " + billAmount);

	        sc.close();
	    }
	}

