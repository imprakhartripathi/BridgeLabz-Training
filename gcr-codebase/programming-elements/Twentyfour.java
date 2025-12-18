// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.

public class Twentyfour {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();
            
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        }
    }
}
