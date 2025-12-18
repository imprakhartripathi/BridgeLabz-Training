
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
        int number = inp.nextInt();
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
}
