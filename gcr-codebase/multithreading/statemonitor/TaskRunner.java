package multithreading.statemonitor;

public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            for (int i = 0; i < 1000000; i++) {}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
