import java.util.Scanner;

public class InvoiceGeneratorApp {

    static class InvoiceUtils {

        public static String[] parseInvoice(String input) {
            return input.split(",");
        }

        public static int getTotalAmount(String[] tasks) {
            int total = 0;
            for (String task : tasks) {
                String[] parts = task.split("-");
                if (parts.length < 2) {
                    throw new IllegalArgumentException("Invalid invoice format");
                }
                String amount = parts[1].replaceAll("[^0-9]", "");
                total += Integer.parseInt(amount);
            }
            return total;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter invoice details");
            System.out.println("Format: Task - Amount INR, Task - Amount INR");
            System.out.print("Input: ");
            String input = sc.nextLine();
            try {
                String[] tasks = InvoiceUtils.parseInvoice(input);
                int total = InvoiceUtils.getTotalAmount(tasks);

                System.out.println("\nInvoice Breakdown:");
                for (String task : tasks) {
                    System.out.println(task.trim());
                }

                System.out.println("\nTotal Amount: " + total + " INR");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}