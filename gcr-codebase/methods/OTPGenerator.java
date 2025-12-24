
/*
Program:
Generate a 6-digit OTP number using Math.random().
Generate the OTP 10 times, store them in an array,
and check whether all OTPs generated are unique.
*/

public class OTPGenerator {

    // Method to generate a 6 digit OTP
    public static int generateOTP() {
        // Generates numbers from 100000 to 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otps);

        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nDuplicate OTPs found.");
        }
    }
}
