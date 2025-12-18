import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            String str = inp.nextLine();
            System.out.println(isPalindrome(str));
        }
    }

    private static boolean isPalindrome(String s) {
        if (s == null) return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!Character.isLetterOrDigit(ci)) { i++; continue; }
            if (!Character.isLetterOrDigit(cj)) { j--; continue; }
            if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) return false;
            i++; j--;
        }
        return true;
    }
}