package backup;

import backup.impl.*;
import backup.exception.InvalidBackupPathException;

public class Driver {
    public static void main(String[] args) {

        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.scheduleBackup(new BackupTask("/etc", 10));
            scheduler.scheduleBackup(new BackupTask("/home/user/docs", 5));
            scheduler.scheduleBackup(new BackupTask("", 1)); // will fail
        } catch (InvalidBackupPathException e) {
            System.out.println("[Exception Caught] " + e);
        }

        scheduler.executeBackups();
    }
}
