public class ThreadD implements Runnable {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Running Thread"+ i +" from Class D");
        }
        System.out.println("Exit From Class D");
    }
}
