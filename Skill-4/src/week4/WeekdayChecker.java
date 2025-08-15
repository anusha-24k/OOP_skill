package week4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class WeekdayChecker {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter date (yyyy-MM-dd): ");
	        String givenDate = input.nextLine();

	        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate local = LocalDate.parse(givenDate, pattern);

	        System.out.println("Day of Week: " + local.getDayOfWeek());

	        input.close();
	    }
}
