package searching.impl;

public class LinearSearchWordInSentence {
    public static String find(String[] sentences, String word) {
        for (String s : sentences)
            if (s.contains(word)) return s;
        return "Not Found";
    }
}
