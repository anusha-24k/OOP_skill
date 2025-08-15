package week4;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class FindAge {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter birthdate (dd-MM-yyyy): ");
	        String dob = input.nextLine();

	        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate birth = LocalDate.parse(dob, df);

	        LocalDate today = LocalDate.now();
	        Period difference = Period.between(birth, today);

	        System.out.println("Age: " + difference.getYears() + " years");

	        input.close();
	    }
}
