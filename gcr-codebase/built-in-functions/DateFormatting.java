// 3. Problem 3: Date Formatting Write a program that:
// ➢ Displays the current date in three different formats:
// ■ dd/MM/yyyy
// ■ yyyy-MM-dd
// ■ EEE, MMM dd, yyyy

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatTwo = DateTimeFormatter.ofPattern("yyyy MM dd");
        DateTimeFormatter formatThree = DateTimeFormatter.ofPattern("EEE MMM dd yyyy");

        System.out.println("Date in dd/MM/yyyy format");
        System.out.println(today.format(formatOne));

        System.out.println();

        System.out.println("Date in yyyy MM dd format");
        System.out.println(today.format(formatTwo));

        System.out.println();

        System.out.println("Date in EEE MMM dd yyyy format");
        System.out.println(today.format(formatThree));
    }
}
