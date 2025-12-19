public class MaxHandshakes {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();
            
            // Maximum handshakes formula: C(n,2) = n * (n-1) / 2
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        }
    }
}
