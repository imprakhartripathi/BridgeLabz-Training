package multithreading.downloadmanager;

public class DownloadManagerThread extends Thread {

    private String fileName;

    public DownloadManagerThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
            try {
                Thread.sleep(300 + (int)(Math.random() * 300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
