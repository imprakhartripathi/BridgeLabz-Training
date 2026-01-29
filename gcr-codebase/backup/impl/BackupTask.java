package backup.impl;

public class BackupTask implements Comparable<BackupTask> {

    private String path;
    private int priority; // higher = more critical

    public BackupTask(String path, int priority) {
        this.path = path;
        this.priority = priority;
    }

    public String getPath() {
        return path;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Backup: " + path + " (priority " + priority + ")";
    }
}
