package backup.impl;

import backup.exception.InvalidBackupPathException;

import java.util.PriorityQueue;

public class BackupScheduler {

    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void scheduleBackup(BackupTask task)
            throws InvalidBackupPathException {

        if (task.getPath() == null || task.getPath().isEmpty()) {
            throw new InvalidBackupPathException();
        }
        queue.add(task);
    }

    public void executeBackups() {
        while (!queue.isEmpty()) {
            System.out.println("Executing " + queue.poll());
        }
    }
}
