public class ThreadExample {
    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();


        ThreadExampleRunnableInterface teri = new ThreadExampleRunnableInterface();
        Thread t = new Thread(teri);
        t.start();

        // OR
        Thread t1 = new Thread(new ThreadExampleExtendingThread());
        t1.start();

        // OR

        Thread td = new Thread(new ThreadD());
        Thread te = new Thread(new ThreadE());
        td.start();
        te.start();
    }
}
