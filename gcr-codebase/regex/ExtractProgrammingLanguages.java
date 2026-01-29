package regex;

import java.util.*;
import java.util.regex.*;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // List of programming languages
        List<String> languages = Arrays.asList(
                "Java",
                "JavaScript",
                "JS",
                "Python",
                "Py",
                "Go",
                "C",
                "C++",
                "CPP",
                "Rust",
                "Rs",
                "TypeScript",
                "TS"
        );

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
