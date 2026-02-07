package multithreading.printshop;

class PrintJob implements Runnable {

    private String name;
    private int pages;

    public PrintJob(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public void run() {
        for (int i = 1; i <= pages; i++) {
            System.out.println("Printing " + name + " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintShopApp {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(new PrintJob("Job1", 10));
        Thread t2 = new Thread(new PrintJob("Job2", 5));

        t1.setPriority(5);
        t2.setPriority(8);

        t1.start();
        t2.start();

        try {
            t1.join(); t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All jobs completed in " +
                (System.currentTimeMillis() - start) + "ms");
    }
}
