package functional_interfaces;

interface Backupable {}

class UserData implements Backupable {}

public class BackupDemo {
    public static void main(String[] args) {
        UserData u = new UserData();
        System.out.println(u instanceof Backupable ? "Backup allowed" : "No backup");
    }
}
