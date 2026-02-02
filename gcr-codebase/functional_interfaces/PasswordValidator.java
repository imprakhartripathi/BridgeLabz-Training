package functional_interfaces;

interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Password: ");
        System.out.println("Is Password Strong: " + SecurityUtils.isStrong(sc.nextLine()));
    }
}
