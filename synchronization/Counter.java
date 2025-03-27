package synchronization;

public class Counter {
    private int count = 0;

    public void increment() {
        count++; // not synchronized


        
        // synchronized (this){
        //     count++; // synchronized
        // }
    }

    public int getCount() {
        return count;
    }
}
