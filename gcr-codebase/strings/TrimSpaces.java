// Write a program to trim the leading and trailing spaces from a string using the charAt() method 
// Hint => 
// Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
// Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
// Write a method to compare two strings using the charAt() method and return a boolean result
// The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result


public class TrimSpaces {
	public static int[] trimPositions(String s) {
		if (s == null) return new int[]{0,0};
		int n = s.length();
		int start = 0;
		while (start < n && s.charAt(start) == ' ') {
			start++;
		}
		int end = n;
		while (end - 1 >= 0 && s.charAt(end - 1) == ' ') {
			end--;
		}
		if (start > end) return new int[]{0,0};
		return new int[]{start, end};
	}

	public static String substringUsingCharAt(String s, int start, int end) {
		if (s == null) return null;
		if (start < 0) start = 0;
		if (end > s.length()) end = s.length();
		if (start >= end) return "";
		StringBuilder sb = new StringBuilder(end - start);
		for (int i = start; i < end; i++) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	// Compare two strings using charAt
	public static boolean compareStringsUsingCharAt(String a, String b) {
		if (a == null && b == null) return true;
		if (a == null || b == null) return false;
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String original = "   Hello, BridgeLabz! Trim this string.   ";
		System.out.println("Original: '" + original + "'");

		int[] pos = trimPositions(original);
		System.out.println("Trim indices -> start: " + pos[0] + ", end: " + pos[1]);

		String customTrimmed = substringUsingCharAt(original, pos[0], pos[1]);
		System.out.println("Custom trimmed: '" + customTrimmed + "'");

		String builtinTrimmed = original.trim();
		System.out.println("Builtin .trim(): '" + builtinTrimmed + "'");

		boolean equal = compareStringsUsingCharAt(customTrimmed, builtinTrimmed);
		System.out.println("Custom trimmed equals builtin trim(): " + equal);
	}
}
