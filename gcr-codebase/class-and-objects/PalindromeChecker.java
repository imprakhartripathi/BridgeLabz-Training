public class PalindromeChecker {
    String text;

    void check() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();

        if (clean.equals(reverse))
            System.out.println(text + " is palindrome");
        else
            System.out.println(text + " is not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "A man a plan a canal Panama";
        p1.check();

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";
        p2.check();
    }
}

