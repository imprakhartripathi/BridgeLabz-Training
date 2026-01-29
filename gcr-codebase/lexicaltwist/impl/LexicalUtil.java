package lexicaltwist.impl;

import java.util.LinkedHashSet;

public class LexicalUtil {

    public static void process(String w1, String w2) {
        if (w1.contains(" ") || w2.contains(" ")) {
            System.out.println(w1 + " is an invalid word");
            return;
        }

        String rev = new StringBuilder(w1).reverse().toString();
        if (rev.equalsIgnoreCase(w2)) {
            String res = rev.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println(res);
            return;
        }

        String combined = (w1 + w2).toUpperCase();
        int vowels = 0, consonants = 0;

        for (char c : combined.toCharArray()) {
            if ("AEIOU".indexOf(c) >= 0) vowels++;
            else consonants++;
        }

        if (vowels == consonants) {
            System.out.println("Vowels and consonants are equal");
            return;
        }

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : combined.toCharArray()) {
            if (vowels > consonants && "AEIOU".indexOf(c) >= 0) set.add(c);
            if (consonants > vowels && "AEIOU".indexOf(c) < 0) set.add(c);
            if (set.size() == 2) break;
        }

        set.forEach(System.out::print);
    }
}
