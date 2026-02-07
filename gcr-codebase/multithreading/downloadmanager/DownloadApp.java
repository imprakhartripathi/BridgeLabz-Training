package multithreading.downloadmanager;

public class DownloadApp {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new DownloadManagerThread("Document.pdf");
        Thread t2 = new DownloadManagerThread("Image.jpg");

        Thread t3 = new Thread(
                new DownloadManagerRunnable("Video.mp4"),
                "Downloader-3"
        );

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}
