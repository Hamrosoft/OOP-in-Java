public class ThreadImplementation {
    public static void main(String[] args) {
        ThreadExampleExtendingThread teet = new ThreadExampleExtendingThread();
        teet.start();

        // OR

        new ThreadExampleExtendingThread().start();

    }
}
