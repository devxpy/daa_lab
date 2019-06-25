package misc;

class MyThread extends Thread {
    synchronized static void doWork(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }

    int n;

    MyThread(int n) {
        this.n = n;
    }

    public void run() {
        doWork(n);
    }
}

public class Synchronized {
    public static void main(String[] args) {
        for (int n : new int[]{1, 10, 100}) {
            Thread t = new MyThread(n);
            t.start();

        }
    }
}
