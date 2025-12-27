import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of visitors: ");
            int visitors = sc.nextInt();
            
            if (visitors <= 0) {
                System.out.println("Invalid number of visitors");
                return;
            }
            
            int count = 1;
            
            while (count <= visitors) {
                
                System.out.print("Visitor " + count + " enter your number: ");
                int number = sc.nextInt();
                
                if (number <= 0) {
                    System.out.println("Invalid number input");
                    continue;
                }
                
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("Congratulations you win a gift");
                } else {
                    System.out.println("Sorry no gift this time");
                }
                
                count = count + 1;
            }
        }
    }
}
