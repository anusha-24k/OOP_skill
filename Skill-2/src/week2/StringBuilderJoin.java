package week2;

import java.util.Scanner;

public class StringBuilderJoin {
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		
		System.out.println("Enter string 1: ");
		StringBuilder sb1=new StringBuilder(sc.nextLine());
		
		System.out.print("Enter string 2: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());
        
        System.out.println("String 1: " + sb1);
        System.out.println("String 2: " + sb2);
        
        sb1.append(sb2);
       
        System.out.println("String after append: " + sb2);
        
        sc.close();
	}
}

