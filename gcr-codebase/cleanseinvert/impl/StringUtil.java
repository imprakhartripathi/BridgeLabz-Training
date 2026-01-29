package cleanseinvert.impl;

public class StringUtil {

    public String cleanseAndInvert(String input) {
        if (input == null || input.length() < 6) {
            return "";
        }

        if (!input.matches("[A-Za-z]+")) {
            return "";
        }

        input = input.toLowerCase();

        StringBuilder filtered = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c % 2 != 0) { // odd ASCII
                filtered.append(c);
            }
        }

        filtered.reverse();

        for (int i = 0; i < filtered.length(); i += 2) {
            filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
        }

        return filtered.toString();
    }
}
