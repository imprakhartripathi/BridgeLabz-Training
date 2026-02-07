package multithreading.statemonitor;

public class MonitorApp {

    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(new Thread[]{t1, t2});

        t1.start();
        t2.start();
        monitor.start();
    }
}
