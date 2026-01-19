package runtimeanalysis;

public class StringConcatenationComparison {

    public static void main(String[] args) {
        int n = 100_000;

        long start, stringTime, stringBuilderTime, stringBufferTime;

        start = System.nanoTime();
        @SuppressWarnings("unused")
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        stringTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        stringBuilderTime = System.nanoTime() - start;

        start = System.nanoTime();
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sf.append("a");
        }
        stringBufferTime = System.nanoTime() - start;

        System.out.println("\n\n--------String Concatenation Performance Comparison--------");
        System.out.printf("String        : %d ns\n", stringTime);
        System.out.printf("StringBuilder : %d ns\n", stringBuilderTime);
        System.out.printf("StringBuffer  : %d ns", stringBufferTime);

        long fastest = Math.min(stringTime,
                Math.min(stringBuilderTime, stringBufferTime));

        System.out.print("\n\nFastest Approach: ");
        if (fastest == stringBuilderTime) {
            System.out.print("StringBuilder (O(N), non-synchronized)");
        } else if (fastest == stringBufferTime) {
            System.out.print("StringBuffer (O(N), synchronized)");
        } else {
            System.out.print("String (O(N^2), immutable)");
        }
    }
}
