package week2;
import java.util.Scanner;
public class CharArrayToString {

	public static void main(String[] args) {
		
		char ch[]= {'H','E','L','L','O'};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1=sc.nextLine();
		
		String s2 = new String(ch);
		
		System.out.println("characters to string: " + s2);
		System.out.println("String is: " + s1);
		
		sc.close();
		
	}

}
