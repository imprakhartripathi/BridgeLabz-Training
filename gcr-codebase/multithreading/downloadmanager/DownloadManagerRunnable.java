package multithreading.downloadmanager;

public class DownloadManagerRunnable implements Runnable {

    private String fileName;

    public DownloadManagerRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + i + "%");
            try {
                Thread.sleep(300 + (int)(Math.random() * 300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
