package backup.exception;

public class InvalidBackupPathException extends Exception {
    public InvalidBackupPathException() {
        super("[System Error] Invalid backup path");
    }
}
