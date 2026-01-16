package stringbuilder;

import java.util.HashSet;

public class StringBuilderRemoveDuplicates {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Something to remove Duplicates from: ");
        String input = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
