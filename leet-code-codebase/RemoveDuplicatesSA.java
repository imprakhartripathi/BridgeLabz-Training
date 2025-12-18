import java.util.*;

class RemoveDuplicatesSA {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        String line;
        try (Scanner sc = new Scanner(System.in)) {
            line = "";
            if (sc.hasNextLine()) {
                line = sc.nextLine().trim();
            }
        }

        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] parts = line.split("\\s+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        RemoveDuplicatesSA solver = new RemoveDuplicatesSA();
        int k = solver.removeDuplicates(nums);

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
