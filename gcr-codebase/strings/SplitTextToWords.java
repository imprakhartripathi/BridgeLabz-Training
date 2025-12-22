
// Write a program to split the text into words, compare the result with the split() method and display the result 
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to find the length of the String without using the built-in length() method. 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
// Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
// Then Create an array to store the words and use the indexes to extract the words
// Create a method to compare the two String arrays and return a boolean
// The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result

    import java.util.Scanner;

    public class SplitTextToWords {

        // Method to split text into words without using the builtin split() method
        public static String[] splitText(String text) {
            int wordCount = 1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            }

            String[] words = new String[wordCount];
            int wordIndex = 0;
            int startIndex = 0;

            for (int i = 0; i <= text.length(); i++) {
                if (i == text.length() || text.charAt(i) == ' ') {
                    words[wordIndex] = text.substring(startIndex, i);
                    wordIndex++;
                    startIndex = i + 1;
                }
            }

            return words;
        }

        // Method to compare two string arrays
        public static boolean compareStringArrays(String[] arr1, String[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter a text: ");
                String input = sc.nextLine();

                String[] customSplitWords = splitText(input);
                String[] builtInSplitWords = input.split(" ");

                boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

                System.out.println("Custom Split Words: ");
                for (String word : customSplitWords) {
                    System.out.println(word);
                }

                System.out.println("Built-in Split Words: ");
                for (String word : builtInSplitWords) {
                    System.out.println(word);
                }

                System.out.println("Are both splits equal? " + areEqual);
            }
        }
    }