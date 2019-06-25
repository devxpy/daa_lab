class Queue {
    int value = -1;
    boolean valueSet = false;

    synchronized public void put(int item) {
        try {
            while (valueSet) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        valueSet = true;
        value = item;
        notify();
    }

    synchronized public int get() {
        try {
            while (!valueSet) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        valueSet = false;
        notify();
        return value;
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Queue q = new Queue();

        Thread producer = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    q.put(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread consumer = new Thread() {
            public void run() {
                while (true) {
                    System.out.println(q.get());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        producer.start();
        consumer.start();
    }
}
