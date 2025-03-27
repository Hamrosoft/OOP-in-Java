package synchronization;

public class RaceConditionExample {

    public static void main(String[] args) {

        // This classs comes from Counter.java
        Counter counter = new Counter();

        // first thread using Runnable Instance.
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        // second thread using lambda expression. (()->{})
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // the expexted output is 2000 but may print more or less due to race condition.
        // we can mitigitae that using synchronized block of code.
        System.out.println("The final result is : " + counter.getCount());

    }

}