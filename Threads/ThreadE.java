public class ThreadE implements Runnable {
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Running Thread"+ i +" from Class E");
        }
        System.out.println("Exit From Class E");
    }
}
