package week1;
import java.util.Scanner;
public class Explict_conversion {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		double a= sc.nextDouble();
		int b;
		
		b=(int)a;
		
		System.out.println("Original double value: " + a);
        System.out.println("After narrowing to int: " + b);
		
        sc.close();
	}
}
