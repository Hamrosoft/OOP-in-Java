public class ThreadC extends Thread {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Running Thread"+ i +" from Class C");
        }
        System.out.println("Exit From Class C");
    }
}
