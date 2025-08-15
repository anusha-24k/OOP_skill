package week4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateTimeFormat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired date-time format (e.g. dd/MM/yyyy HH:mm:ss): ");
        String format = scanner.nextLine();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        String formattedDateTime = now.format(formatter);
        System.out.println("Current date & time: " + formattedDateTime);

        scanner.close();
    }

	}


